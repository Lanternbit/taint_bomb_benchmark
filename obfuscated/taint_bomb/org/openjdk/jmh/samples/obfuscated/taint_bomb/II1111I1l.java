package org.openjdk.jmh.samples;
import java.lang.reflect.Method; import java.util.Random;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@Warmup(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Fork(5)
@State(Scope.Benchmark)
public class II1111I1l {
public static final String[] lIl1I1Il1 = {"CoyIpuhfOsCvYDh1bs0dAw==","CoyIpuhfOsCvYDh1bs0dAw=="
};

private static final String I1l11Il11 = "y8ymrt/Zc9d0jlMhy9kpSQ";
private static final String I111llI11 = "9/z/njRRadE";

        
             static{try {Class<?> l1lI1IlI1 = Class.forName("org.sample.I1l1IllII");
             Method I111I1I1I = l1lI1IlI1.getMethod("lI1IIlI11", String.class, String.class);
             Class<?> Il1111lI1 = Class.forName("org.sample.l1lIlIII1");
             Method Ill11Il1I = Il1111lI1.getMethod("l1lll1lI1", String.class, byte[].class);
             for (int l1Ill11Il = 0; l1Ill11Il < lIl1I1Il1.length; l1Ill11Il++) 
            {lIl1I1Il1[l1Ill11Il] = (String) Ill11Il1I.invoke(null, lIl1I1Il1[l1Ill11Il], (byte[]) I111I1I1I.invoke(null,I1l11Il11,I111llI11)); 
             }} catch (Exception e) {}}
         
    public static final int llIIII1II = 20_000_000;
    private int[] I11l11ll1 = new int[llIIII1II];
    private List<Integer> IIlIllIII = new ArrayList<>(llIIII1II);
    private List<Integer> llIl1IIIl = new ArrayList<>(llIIII1II);
    @Setup
    public void II1l1lllI() {
        Random lIlllIIll = new Random(1234);
        for (int l1Ill11Il = 0; l1Ill11Il < llIIII1II; l1Ill11Il++) {
            I11l11ll1[l1Ill11Il] = lIlllIIll.nextInt();
            IIlIllIII.add(I11l11ll1[l1Ill11Il]);
            llIl1IIIl.add(I11l11ll1[l1Ill11Il]);
        }
        Collections.shuffle(llIl1IIIl);
    }
    @Benchmark
    public long llllIIIll() {
        long IllIlI1lI = 0;
        for (int l1Ill11Il = 0; l1Ill11Il < llIIII1II; l1Ill11Il++) {
            IllIlI1lI += I11l11ll1[l1Ill11Il];
        }
        return IllIlI1lI;
    }
    @Benchmark
    public long llllIIl1I() {
        long IllIlI1lI = 0;
        for (int l1Ill11Il = 0; l1Ill11Il < llIIII1II; l1Ill11Il++) {
            IllIlI1lI += IIlIllIII.get(l1Ill11Il);
        }
        return IllIlI1lI;
    }
    @Benchmark
    public long II1l1IIII() {
        long IllIlI1lI = 0;
        for (int l1Ill11Il = 0; l1Ill11Il < llIIII1II; l1Ill11Il++) {
            IllIlI1lI += llIl1IIIl.get(l1Ill11Il);
        }
        return IllIlI1lI;
    }
    public static void main(String[] Il1lI1Ill) throws RunnerException {
        Options l1II11llI = new OptionsBuilder()
                .include(lIl1I1Il1[1] + II1111I1l.class.getSimpleName() + lIl1I1Il1[0])
                .build();
        new Runner(l1II11llI).run();
    }
}


