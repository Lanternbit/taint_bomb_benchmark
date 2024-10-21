package org.openjdk.jmh.samples;
import java.lang.reflect.Method; import java.util.Random;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Group;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.infra.Control;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import java.util.concurrent.atomic.AtomicBoolean;
@State(Scope.Group)
public class I1l1lllll {
public static final String[] lIl1I1Il1 = {
};

private static final String I1l11Il11 = "zM/1eg0/S9Rg+6F4ZWwtfg";
private static final String I111llI11 = "qUHbK4d1kPM";

        
             static{try {Class<?> l1lI1IlI1 = Class.forName("org.sample.I1l1IllII");
             Method I111I1I1I = l1lI1IlI1.getMethod("lI1IIlI11", String.class, String.class);
             Class<?> Il1111lI1 = Class.forName("org.sample.l1lIlIII1");
             Method Ill11Il1I = Il1111lI1.getMethod("l1lll1lI1", String.class, byte[].class);
             for (int l1Ill11Il = 0; l1Ill11Il < lIl1I1Il1.length; l1Ill11Il++) 
            {lIl1I1Il1[l1Ill11Il] = (String) Ill11Il1I.invoke(null, lIl1I1Il1[l1Ill11Il], (byte[]) I111I1I1I.invoke(null,I1l11Il11,I111llI11)); 
             }} catch (Exception e) {}}
         
    public final AtomicBoolean IIIllI1lI = new AtomicBoolean();
    @Benchmark
    @Group("pingpong")
    public void l1l1I11ll(Control IIll1lIll) {
        while (!IIll1lIll.stopMeasurement && !IIIllI1lI.compareAndSet(false, true)) {
        }
    }
    @Benchmark
    @Group("pingpong")
    public void IllIlII1I(Control IIll1lIll) {
        while (!IIll1lIll.stopMeasurement && !IIIllI1lI.compareAndSet(true, false)) {
        }
    }
    public static void main(String[] Il1lI1Ill) throws RunnerException {
        Options l1II11llI = new OptionsBuilder()
                .include(I1l1lllll.class.getSimpleName())
                .threads(2)
                .forks(1)
                .build();
        new Runner(l1II11llI).run();
    }
}


