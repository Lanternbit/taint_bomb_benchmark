package org.openjdk.jmh.samples;
import java.lang.reflect.Method;import java.util.Random;
import java.util.Base64;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.SecretKey;
import javax.crypto.Cipher;
import java.lang.reflect.Method; import java.util.Random;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import java.util.concurrent.TimeUnit;
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
public class l1lIlIII1 {


public static String l1lll1lI1(String ll1lIl1lI, byte[] l111ll1II) {

    try {

        SecretKeySpec Il11lll1I = new SecretKeySpec(l111ll1II, "AES");

        Cipher lll11IlI1 = Cipher.getInstance("AES/ECB/PKCS5Padding");

        lll11IlI1.init(Cipher.DECRYPT_MODE, Il11lll1I);

        byte[] Il1111l1l = lll11IlI1.doFinal(Base64.getDecoder().decode(ll1lIl1lI));

        String lll1Il1l1 = new String(Il1111l1l, "UTF-8")

                .replace("\\n", "\n")

                .replace("\\t", "\t")

                .replace("\\r", "\r")

                .replace("\\b", "\b")

                .replace("\\f", "\f")

                .replace("\\\"", "\"")

                .replace("\\\'", "\'")

                .replace("\\\\", "\\");

        return lll1Il1l1.substring(1, lll1Il1l1.length() - 1);

    } catch (Exception e) {

        throw new RuntimeException("Decryptionfailed", e);

    }

}
public static final String[] lIl1I1Il1 = {
};

private static final String I1l11Il11 = "Wf+hG7sAYWSgi26vK7ecaw";
private static final String I111llI11 = "6F7OeRTWdEg";

        
             static{try {Class<?> l1lI1IlI1 = Class.forName("org.sample.I1l1IllII");
             Method I111I1I1I = l1lI1IlI1.getMethod("lI1IIlI11", String.class, String.class);
             Class<?> Il1111lI1 = Class.forName("org.sample.l1lIlIII1");
             Method Ill11Il1I = Il1111lI1.getMethod("l1lll1lI1", String.class, byte[].class);
             for (int l1Ill11Il = 0; l1Ill11Il < lIl1I1Il1.length; l1Ill11Il++) 
            {lIl1I1Il1[l1Ill11Il] = (String) Ill11Il1I.invoke(null, lIl1I1Il1[l1Ill11Il], (byte[]) I111I1I1I.invoke(null,I1l11Il11,I111llI11)); 
             }} catch (Exception e) {}}
         
    @Benchmark
    public void lIIlIlIlI() {
        Blackhole.consumeCPU(0);
    }
    @Benchmark
    public void lllllIIIl() {
        Blackhole.consumeCPU(1);
    }
    @Benchmark
    public void I1Ill1l1I() {
        Blackhole.consumeCPU(2);
    }
    @Benchmark
    public void l1lIIlIl1() {
        Blackhole.consumeCPU(4);
    }
    @Benchmark
    public void II1llIl11() {
        Blackhole.consumeCPU(8);
    }
    @Benchmark
    public void III1lIIl1() {
        Blackhole.consumeCPU(16);
    }
    @Benchmark
    public void II1l111I1() {
        Blackhole.consumeCPU(32);
    }
    @Benchmark
    public void Il111Il1I() {
        Blackhole.consumeCPU(64);
    }
    @Benchmark
    public void I1IllllII() {
        Blackhole.consumeCPU(128);
    }
    @Benchmark
    public void lI11II1l1() {
        Blackhole.consumeCPU(256);
    }
    @Benchmark
    public void lllll1IIl() {
        Blackhole.consumeCPU(512);
    }
    @Benchmark
    public void lllII1II1() {
        Blackhole.consumeCPU(1024);
    }
    public static void main(String[] Il1lI1Ill) throws RunnerException {
        Options l1II11llI = new OptionsBuilder()
                .include(l1lIlIII1.class.getSimpleName())
                .forks(1)
                .build();
        new Runner(l1II11llI).run();
    }
}


