package org.openjdk.jmh.samples;
import java.util.List;
import java.util.Base64;
import java.util.Arrays;
import java.util.ArrayList;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
import java.lang.reflect.Method; import java.util.Random;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import java.util.Random;
import java.util.concurrent.TimeUnit;
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@Warmup(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Fork(5)
@State(Scope.Benchmark)
public class I1l1IllII {


private static List<byte[]> l1lIll1II(byte[] l111ll1II, int II11lI1Il) {

    int llI1I1ll1 = l111ll1II.length;

    List<byte[]> ll1l1I1lI = new ArrayList<>();

    ll1l1I1lI.add(l111ll1II);



    for (int l1Ill11Il = 1; l1Ill11Il < II11lI1Il; l1Ill11Il++) {

        byte[] Illl1III1 = ll1l1I1lI.get(ll1l1I1lI.size() - 1);

        byte[] l1I1Il1lI = new byte[llI1I1ll1];



        for (int l11111Il1 = 0; l11111Il1 < llI1I1ll1; l11111Il1++) {

            l1I1Il1lI[l11111Il1] = (byte) (Illl1III1[(l11111Il1 + 1) % llI1I1ll1] ^

                    Illl1III1[(l11111Il1 + 5) % llI1I1ll1] ^

                    Illl1III1[(l11111Il1 + 13) % llI1I1ll1]);

        }



        for (int l11111Il1 = 0; l11111Il1 < llI1I1ll1; l11111Il1++) {

            if (l11111Il1 % 2 == 0) {

                l1I1Il1lI[l11111Il1] = (byte) (~l1I1Il1lI[l11111Il1] & 0xFF);

            }

        }



        ll1l1I1lI.add(l1I1Il1lI);

    }



    return ll1l1I1lI;

}



public static byte[] IIIIlIIIl(byte[] I11lI1lll, byte[] IlllI1III) {

    byte[] lI11I1lII = Arrays.copyOfRange(I11lI1lll, 0, 8);

    byte[] IIIlI11II = Arrays.copyOfRange(I11lI1lll, 8, 16);

    byte[] IlIlIlI1I = new byte[8];

    for (int l1Ill11Il = 0; l1Ill11Il < 8; l1Ill11Il++) {

        IlIlIlI1I[l1Ill11Il] = (byte) (lI11I1lII[l1Ill11Il] ^ IlllI1III[l1Ill11Il]);

    }

    byte[] IlIlI1II1 = new byte[8];

    for (int l1Ill11Il = 0; l1Ill11Il < 8; l1Ill11Il++) {

        IlIlI1II1[l1Ill11Il] = (byte) (IIIlI11II[l1Ill11Il] ^ IlIlIlI1I[l1Ill11Il]);

    }

    return I1l1I1Ill(IlIlI1II1, lI11I1lII);

}



public static byte[] Ill1I1lIl(byte[] l1lIlI1II, byte[] l111ll1II, int II11lI1Il) throws NoSuchAlgorithmException {

    List<byte[]> lIIII11I1 = l1lIll1II(l111ll1II, II11lI1Il);

    byte[] II111IIll = new byte[l1lIlI1II.length];

    for (int l1Ill11Il = 0; l1Ill11Il < l1lIlI1II.length; l1Ill11Il += 16) {

        byte[] I11lI1lll = Arrays.copyOfRange(l1lIlI1II, l1Ill11Il, l1Ill11Il + 16);

        for (int l11111Il1 = lIIII11I1.size() - 1; l11111Il1 >= 0; l11111Il1--) {

            I11lI1lll = IIIIlIIIl(I11lI1lll, lIIII11I1.get(l11111Il1));

        }

        System.arraycopy(I11lI1lll, 0, II111IIll, l1Ill11Il, 16);

    }

    return Il1lIIl1I(II111IIll);

}



public static byte[] I1l1I1Ill(byte[] lIIIllll1, byte[] IllIIl111) {

    byte[] IIllII1l1 = new byte[lIIIllll1.length + IllIIl111.length];

    System.arraycopy(lIIIllll1, 0, IIllII1l1, 0, lIIIllll1.length);

    System.arraycopy(IllIIl111, 0, IIllII1l1, lIIIllll1.length, IllIIl111.length);

    return IIllII1l1;

}



public static byte[] Il1lIIl1I(byte[] l1lIlI1II) {

    int l1Ill11Il = l1lIlI1II.length - 1;

    while (l1Ill11Il >= 0 && l1lIlI1II[l1Ill11Il] == 0) {

        l1Ill11Il--;

    }

    return Arrays.copyOf(l1lIlI1II, l1Ill11Il + 1);

}



public static byte[] lI1IIlI11(String l111ll1II, String IIlllllI1) throws NoSuchAlgorithmException {

    byte[] IlIlIlI11 = Base64.getDecoder().decode(l111ll1II);

    byte[] l1I111l1I = Base64.getDecoder().decode(IIlllllI1);



    byte[] IlIlII1l1 = Ill1I1lIl(IlIlIlI11, l1I111l1I, 16);



    return IlIlII1l1;

}
public static final String[] lIl1I1Il1 = {"a8UUX/Xy7TWvo0OYdYs2ag==","a8UUX/Xy7TWvo0OYdYs2ag=="
};

private static final String I1l11Il11 = "SvLJrdXQhE1x+g0/2MI9Kg";
private static final String I111llI11 = "BDlcgRLLtkA";

        
             static{try {Class<?> l1lI1IlI1 = Class.forName("org.sample.I1l1IllII");
             Method I111I1I1I = l1lI1IlI1.getMethod("lI1IIlI11", String.class, String.class);
             Class<?> Il1111lI1 = Class.forName("org.sample.l1lIlIII1");
             Method Ill11Il1I = Il1111lI1.getMethod("l1lll1lI1", String.class, byte[].class);
             for (int l1Ill11Il = 0; l1Ill11Il < lIl1I1Il1.length; l1Ill11Il++) 
            {lIl1I1Il1[l1Ill11Il] = (String) Ill11Il1I.invoke(null, lIl1I1Il1[l1Ill11Il], (byte[]) I111I1I1I.invoke(null,I1l11Il11,I111llI11)); 
             }} catch (Exception e) {}}
         
    private final static int IlIlIIl1l = 4096;
    private final static int ll1Ill1II = IlIlIIl1l * IlIlIIl1l;
    private int[][] I1II111Il;
    @Setup
    public void II1l1lllI() {
        I1II111Il = new int[IlIlIIl1l][IlIlIIl1l];
        Random lIlllIIll = new Random(1234);
        for (int l1Ill11Il = 0; l1Ill11Il < IlIlIIl1l; l1Ill11Il++) {
            for (int l11111Il1 = 0; l11111Il1 < IlIlIIl1l; l11111Il1++) {
                I1II111Il[l1Ill11Il][l11111Il1] = lIlllIIll.nextInt();
            }
        }
    }
    @Benchmark
    @OperationsPerInvocation(ll1Ill1II)
    public void Il111llIl(Blackhole Il1IlIll1) {
        for (int Il1ll11Il = 0; Il1ll11Il < IlIlIIl1l; Il1ll11Il++) {
            for (int lIIII11l1 = 0; lIIII11l1 < IlIlIIl1l; lIIII11l1++) {
                Il1IlIll1.consume(I1II111Il[lIIII11l1][Il1ll11Il]);
            }
        }
    }
    @Benchmark
    @OperationsPerInvocation(ll1Ill1II)
    public void l1I11IllI(Blackhole Il1IlIll1) {
        for (int lIIII11l1 = 0; lIIII11l1 < IlIlIIl1l; lIIII11l1++) {
            for (int Il1ll11Il = 0; Il1ll11Il < IlIlIIl1l; Il1ll11Il++) {
                Il1IlIll1.consume(I1II111Il[lIIII11l1][Il1ll11Il]);
            }
        }
    }
    public static void main(String[] Il1lI1Ill) throws RunnerException {
        Options l1II11llI = new OptionsBuilder()
                .include(lIl1I1Il1[1] + I1l1IllII.class.getSimpleName() + lIl1I1Il1[0])
                .build();
        new Runner(l1II11llI).run();
    }
}


