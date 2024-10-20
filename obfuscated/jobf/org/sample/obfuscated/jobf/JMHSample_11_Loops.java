package org.sample;

import java.util.concurrent.TimeUnit;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OperationsPerInvocation;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

@OutputTimeUnit(TimeUnit.NANOSECONDS)
@BenchmarkMode({Mode.AverageTime})
@State(Scope.Thread)
/* loaded from: test.jar:org/sample/JMHSample_11_Loops.class */
public class JMHSample_11_Loops {
    private static /* synthetic */ int[] llll = null;
    /* synthetic */ int x = llll[0];
    /* synthetic */ int y = llll[1];

    private static void lIlI() {
        llll = new int[8];
        llll[0] = " ".length();
        llll[1] = "  ".length();
        llll[2] = ((38 ^ 68) ^ (100 ^ 53)) & (((106 ^ 0) ^ (251 ^ 162)) ^ (-" ".length()));
        llll[3] = (((70 + 122) - 95) + 30) ^ (19 ^ 102);
        llll[4] = 45 ^ 73;
        llll[5] = (-31750) & 32749;
        llll[6] = (-6287) & 16286;
        llll[7] = (-((-2162) & 22647)) & (-10331) & 130815;
    }

    @Benchmark
    public int measureRight() {
        return this.x + this.y;
    }

    @Benchmark
    @OperationsPerInvocation(1000)
    public int measureWrong_1000() {
        return reps(llll[5]);
    }

    @Benchmark
    @OperationsPerInvocation(100)
    public int measureWrong_100() {
        return reps(llll[4]);
    }

    @Benchmark
    @OperationsPerInvocation(10000)
    public int measureWrong_10000() {
        return reps(llll[6]);
    }

    private int reps(int llllllllllIlIlI) {
        int llllllllllIlIIl = llll[2];
        int llllllllllIllII = llll[2];
        while (lIll(llllllllllIllII, llllllllllIlIlI)) {
            llllllllllIlIIl += this.x + this.y;
            llllllllllIllII++;
            "".length();
            if (((179 ^ 160) ^ (123 ^ 108)) <= 0) {
                return ((98 ^ 55) ^ (237 ^ 149)) & (((69 ^ 4) ^ (250 ^ 150)) ^ (-" ".length()));
            }
        }
        return llllllllllIlIIl;
    }

    private static boolean lIll(int i, int i2) {
        return i < i2;
    }

    public static void main(String[] lllllllllIlIIIl) throws RunnerException {
        Options lllllllllIlIIII = new OptionsBuilder().include(JMHSample_11_Loops.class.getSimpleName()).forks(llll[0]).build();
        new Runner(lllllllllIlIIII).run();
        "".length();
    }

    @Benchmark
    @OperationsPerInvocation(1)
    public int measureWrong_1() {
        return reps(llll[0]);
    }

    @Benchmark
    @OperationsPerInvocation(100000)
    public int measureWrong_100000() {
        return reps(llll[7]);
    }

    static {
        lIlI();
    }

    @Benchmark
    @OperationsPerInvocation(10)
    public int measureWrong_10() {
        return reps(llll[3]);
    }
}
