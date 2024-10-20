package org.sample;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OperationsPerInvocation;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

@Warmup(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@State(Scope.Benchmark)
@Fork(5)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@BenchmarkMode({Mode.AverageTime})
/* loaded from: test.jar:org/sample/JMHSample_37_CacheAccess.class */
public class JMHSample_37_CacheAccess {
    private /* synthetic */ int[][] matrix;
    private static final /* synthetic */ int MATRIX_SIZE;
    private static /* synthetic */ String[] lIl = null;
    private static /* synthetic */ int[] lIlI = null;
    private static final /* synthetic */ int COUNT;

    @Benchmark
    @OperationsPerInvocation(16777216)
    public void rowFirst(Blackhole lllllllllIlIlIl) {
        int lllllllllIlIlll = lIlI[1];
        while (llll(lllllllllIlIlll, lIlI[0])) {
            int lllllllllIllIII = lIlI[1];
            while (llll(lllllllllIllIII, lIlI[0])) {
                lllllllllIlIlIl.consume(this.matrix[lllllllllIlIlll][lllllllllIllIII]);
                lllllllllIllIII++;
                "".length();
                if (((((5 + 56) - 1) + 94) ^ (((150 + 130) - 193) + 72)) <= 0) {
                    return;
                }
            }
            lllllllllIlIlll++;
            "".length();
            if ("   ".length() <= 0) {
                return;
            }
        }
    }

    public static void main(String[] lllllllllIIllll) throws RunnerException {
        Options lllllllllIIlllI = new OptionsBuilder().include(String.valueOf(new StringBuilder().append(lIl[lIlI[1]]).append(JMHSample_37_CacheAccess.class.getSimpleName()).append(lIl[lIlI[2]]))).build();
        new Runner(lllllllllIIlllI).run();
        "".length();
    }

    private static String l(String lllllllllIIIlIl, String lllllllllIIIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlI[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllIIIllI) {
            lllllllllIIIllI.printStackTrace();
            return null;
        }
    }

    private static void llIl() {
        lIlI = new int[5];
        lIlI[0] = (-11144) & 15239;
        lIlI[1] = ((79 ^ 109) ^ (133 ^ 130)) & (((((89 + 169) - 210) + 127) ^ (((73 + 15) - (-10)) + 40)) ^ (-" ".length()));
        lIlI[2] = " ".length();
        lIlI[3] = (-((-20577) & 30457)) & (-293) & 16787388;
        lIlI[4] = "  ".length();
    }

    static {
        llIl();
        lIII();
        MATRIX_SIZE = lIlI[3];
        COUNT = lIlI[0];
    }

    private static void lIII() {
        lIl = new String[lIlI[4]];
        lIl[lIlI[1]] = l("6COmne2JxKE=", "sjfaZ");
        lIl[lIlI[2]] = llI("Y2w=", "MFFAS");
    }

    private static boolean llll(int i, int i2) {
        return i < i2;
    }

    @Benchmark
    @OperationsPerInvocation(16777216)
    public void colFirst(Blackhole llllllllllIIIIl) {
        int llllllllllIIIll = lIlI[1];
        while (llll(llllllllllIIIll, lIlI[0])) {
            int llllllllllIIlII = lIlI[1];
            while (llll(llllllllllIIlII, lIlI[0])) {
                llllllllllIIIIl.consume(this.matrix[llllllllllIIlII][llllllllllIIIll]);
                llllllllllIIlII++;
                "".length();
                if (" ".length() == "   ".length()) {
                    return;
                }
            }
            llllllllllIIIll++;
            "".length();
            if ("  ".length() != "  ".length()) {
                return;
            }
        }
    }

    private static String llI(String llllllllIllIlIl, String llllllllIllIlII) {
        String str = new String(Base64.getDecoder().decode(llllllllIllIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllIllIlII.toCharArray();
        int llllllllIllIIIl = lIlI[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIlI[1];
        while (llll(i, length)) {
            char llllllllIllIllI = charArray2[i];
            sb.append((char) (llllllllIllIllI ^ charArray[llllllllIllIIIl % charArray.length]));
            "".length();
            llllllllIllIIIl++;
            i++;
            "".length();
            if ((22 ^ 18) < "   ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    @Setup
    public void setup() {
        this.matrix = new int[lIlI[0]][lIlI[0]];
        Random llllllllllIllIl = new Random(1234L);
        int llllllllllIllll = lIlI[1];
        while (llll(llllllllllIllll, lIlI[0])) {
            int lllllllllllIIII = lIlI[1];
            while (llll(lllllllllllIIII, lIlI[0])) {
                this.matrix[llllllllllIllll][lllllllllllIIII] = llllllllllIllIl.nextInt();
                lllllllllllIIII++;
                "".length();
                if ("   ".length() < "  ".length()) {
                    return;
                }
            }
            llllllllllIllll++;
            "".length();
            if (((234 ^ 157) ^ (176 ^ 194)) <= 0) {
                return;
            }
        }
    }
}
