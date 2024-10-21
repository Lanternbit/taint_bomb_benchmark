import os
import subprocess
import sys

CLASSES = [
    "JMHSample_11_Loops",
    "JMHSample_18_Control",
    "JMHSample_21_ConsumeCPU",
    "JMHSample_37_CacheAccess",
    "JMHSample_39_MemoryAccess"
]
# OBFUSCATION_TYPES = ["original", "jobf", "taint_bomb"]
OBFUSCATION_TYPES = ["taint_bomb"]
RESULTS_DIR = "results"


# JMH JAR 파일 경로
JMH_CORE_JAR = "target/dependency/jmh-core-1.35.jar"
JMH_ANNPROCESS_JAR = "target/dependency/jmh-generator-annprocess-1.35.jar"
COMMONS_MATH_JAR = "target/dependency/commons-math3-3.6.1.jar"

if not os.path.exists(RESULTS_DIR):
    os.makedirs(RESULTS_DIR)

for c in CLASSES:
    for t in OBFUSCATION_TYPES:
        print(f"Running benchmark for {c} ({t})")
        
        if t == "original":
            test_class = f"org.sample.{c}"
            classpath = f"target\\classes;{JMH_CORE_JAR};{JMH_ANNPROCESS_JAR};{COMMONS_MATH_JAR}"
        elif t == "jobf":
            test_class = f"org.sample.{c}"
            classpath = f"target\\classes;obfuscated\\jobf;{JMH_CORE_JAR};{JMH_ANNPROCESS_JAR};{COMMONS_MATH_JAR}"
        else:  # taint_bomb
            test_class = f"org.openjdk.jmh.samples.{c}"
            classpath = f"target\\classes;obfuscated\\taint_bomb;target\\dependency\\*"
            # classpath = f"obfuscated\\taint_bomb;{JMH_CORE_JAR};{JMH_ANNPROCESS_JAR};{COMMONS_MATH_JAR}"
        
        output_file = os.path.join(RESULTS_DIR, f"{c}_{t}.csv")
        command = f"java -Dfile.encoding=UTF-8 -Dsun.jnu.encoding=UTF-8 -XX:-PrintCompilation -cp {classpath} org.openjdk.jmh.Main {test_class}"

        print(f"Executing command: {command}")
        
        try:
            result = subprocess.run(command, capture_output=True, text=True, encoding='utf-8', errors='replace')
            print("STDOUT:", result.stdout)
            print("STDERR:", result.stderr)
            
            with open(os.path.join(RESULTS_DIR, f"{c}_{t}_log.txt"), "w", encoding='utf-8') as f:
                f.write(f"STDOUT:\n{result.stdout}\n\nSTDERR:\n{result.stderr}")
        except Exception as e:
            print(f"Error occurred: {e}", file=sys.stderr)
        
        print(f"Benchmark for {c} ({t}) completed")

print(f"All benchmarks completed. Results are saved in {RESULTS_DIR}")