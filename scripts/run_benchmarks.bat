@echo off
setlocal enabledelayedexpansion

set CLASSES=JMHSample_11_Loops JMHSample_18_Control JMHSample_21_ConsumeCPU JMHSample_37_CacheAccess JMHSample_39_MemoryAccess
set OBFUSCATION_TYPES=original jobf taint_bomb
set RESULTS_DIR=results

if not exist "%RESULTS_DIR%" mkdir "%RESULTS_DIR%"

for %%C in (%CLASSES%) do (
    for %%T in (%OBFUSCATION_TYPES%) do (
        echo Running benchmark for %%C (%%T)
        
        if "%%T"=="original" (
            set "TEST_CLASS=org.sample.%%C"
            set "CLASSPATH=target\classes"
        ) else (
            set "TEST_CLASS=org.sample.obfuscated.%%T.%%C"
            set "CLASSPATH=target\classes;obfuscated\%%T"
        )
        
        java -cp "!CLASSPATH!" org.sample.MyBenchmark !TEST_CLASS! test1 > "%RESULTS_DIR%\%%C_%%T.txt"
        
        echo Benchmark for %%C (%%T) completed
    )
)

echo All benchmarks completed. Results are saved in %RESULTS_DIR%