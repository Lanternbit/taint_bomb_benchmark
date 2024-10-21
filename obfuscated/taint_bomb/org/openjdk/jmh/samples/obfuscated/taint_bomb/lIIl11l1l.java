package org.openjdk.jmh.samples;
import java.lang.reflect.Method; import java.util.Random;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import java.util.concurrent.TimeUnit;
@State(Scope.Thread)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
public class lIIl11l1l {
public static final String[] lIl1I1Il1 = {
};

private static final String I1l11Il11 = "pH/Xp75nsmFCaPwvFPBIig";
private static final String I111llI11 = "X7tiohRC1v0";

        
             static{try {Class<?> l1lI1IlI1 = Class.forName("org.sample.I1l1IllII");
             Method I111I1I1I = l1lI1IlI1.getMethod("lI1IIlI11", String.class, String.class);
             Class<?> Il1111lI1 = Class.forName("org.sample.l1lIlIII1");
             Method Ill11Il1I = Il1111lI1.getMethod("l1lll1lI1", String.class, byte[].class);
             for (int l1Ill11Il = 0; l1Ill11Il < lIl1I1Il1.length; l1Ill11Il++) 
            {lIl1I1Il1[l1Ill11Il] = (String) Ill11Il1I.invoke(null, lIl1I1Il1[l1Ill11Il], (byte[]) I111I1I1I.invoke(null,I1l11Il11,I111llI11)); 
             }} catch (Exception e) {}}
         
    int lll111lII = 1;
    int I1IlI1l11 = 2;
    @Benchmark
    public int lIIlI1Il1() {
        return (lll111lII + I1IlI1l11);
    }
    private int I1l11lI1I(int I1l11lI1I) {
        int lIlllIll1 = 0;
        for (int l1Ill11Il = 0; l1Ill11Il < I1l11lI1I; l1Ill11Il++) {
            lIlllIll1 += (lll111lII + I1IlI1l11);
        }
        return lIlllIll1;
    }
    @Benchmark
    @OperationsPerInvocation(1)
    public int l1lI1I11l() {
        return I1l11lI1I(1);
    }
    @Benchmark
    @OperationsPerInvocation(10)
    public int II1I111ll() {
        return I1l11lI1I(10);
    }
    @Benchmark
    @OperationsPerInvocation(100)
    public int IIll1I111() {
        return I1l11lI1I(100);
    }
    @Benchmark
    @OperationsPerInvocation(1_000)
    public int llIIII11l() {
        return I1l11lI1I(1_000);
    }
    @Benchmark
    @OperationsPerInvocation(10_000)
    public int IIIII11II() {
        return I1l11lI1I(10_000);
    }
    @Benchmark
    @OperationsPerInvocation(100_000)
    public int ll1lllIII() {
        return I1l11lI1I(100_000);
    }
    public static void main(String[] Il1lI1Ill) throws RunnerException {
        Options l1II11llI = new OptionsBuilder()
                .include(lIIl11l1l.class.getSimpleName())
                .forks(1)
                .build();
        new Runner(l1II11llI).run();
    }
}


