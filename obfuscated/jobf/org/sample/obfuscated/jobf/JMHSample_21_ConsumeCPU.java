package org.sample;

import java.util.concurrent.TimeUnit;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.OptionsBuilder;

@OutputTimeUnit(TimeUnit.NANOSECONDS)
@BenchmarkMode({Mode.AverageTime})
/* loaded from: test.jar:org/sample/JMHSample_21_ConsumeCPU.class */
public class JMHSample_21_ConsumeCPU {
    private static /* synthetic */ int[] lIIII = null;

    @Benchmark
    public void consume_0128() {
        Blackhole.consumeCPU(128L);
    }

    @Benchmark
    public void consume_0016() {
        Blackhole.consumeCPU(16L);
    }

    @Benchmark
    public void consume_1024() {
        Blackhole.consumeCPU(1024L);
    }

    @Benchmark
    public void consume_0032() {
        Blackhole.consumeCPU(32L);
    }

    @Benchmark
    public void consume_0000() {
        Blackhole.consumeCPU(0L);
    }

    @Benchmark
    public void consume_0002() {
        Blackhole.consumeCPU(2L);
    }

    @Benchmark
    public void consume_0064() {
        Blackhole.consumeCPU(64L);
    }

    @Benchmark
    public void consume_0008() {
        Blackhole.consumeCPU(8L);
    }

    static {
        lI();
    }

    public static void main(String[] llllllllllIIllI) throws RunnerException {
        new Runner(new OptionsBuilder().include(JMHSample_21_ConsumeCPU.class.getSimpleName()).forks(lIIII[0]).build()).run();
        "".length();
    }

    @Benchmark
    public void consume_0256() {
        Blackhole.consumeCPU(256L);
    }

    @Benchmark
    public void consume_0004() {
        Blackhole.consumeCPU(4L);
    }

    @Benchmark
    public void consume_0512() {
        Blackhole.consumeCPU(512L);
    }

    private static void lI() {
        lIIII = new int[1];
        lIIII[0] = " ".length();
    }

    @Benchmark
    public void consume_0001() {
        Blackhole.consumeCPU(1L);
    }
}
