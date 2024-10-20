package org.sample;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

@Warmup(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@State(Scope.Benchmark)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@Fork(5)
@BenchmarkMode({Mode.AverageTime})
/* loaded from: test.jar:org/sample/JMHSample_39_MemoryAccess.class */
public class JMHSample_39_MemoryAccess {
    public static final /* synthetic */ int N;
    private static /* synthetic */ String[] lll = null;
    private static /* synthetic */ int[] lIlI = null;
    private /* synthetic */ int[] intArray = new int[lIlI[0]];
    private /* synthetic */ List<Integer> intList = new ArrayList(lIlI[0]);
    private /* synthetic */ List<Integer> shuffledIntList = new ArrayList(lIlI[0]);

    private static String lll(String lllllllllIIIllI, String lllllllllIIIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllIIIlIl.getBytes(StandardCharsets.UTF_8)), lIlI[4]), "DES");
            Cipher lllllllllIIlIII = Cipher.getInstance("DES");
            lllllllllIIlIII.init(lIlI[3], secretKeySpec);
            return new String(lllllllllIIlIII.doFinal(Base64.getDecoder().decode(lllllllllIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllIIIlll) {
            lllllllllIIIlll.printStackTrace();
            return null;
        }
    }

    static {
        lIll();
        lIII();
        N = lIlI[0];
    }

    private static void lIll() {
        lIlI = new int[5];
        lIlI[0] = (-79) & 20000078;
        lIlI[1] = ((69 ^ 60) ^ (9 ^ 90)) & (((226 ^ 167) ^ (193 ^ 174)) ^ (-" ".length()));
        lIlI[2] = " ".length();
        lIlI[3] = "  ".length();
        lIlI[4] = 168 ^ 160;
    }

    @Benchmark
    public long sumArray() {
        long llllllllllIIlll = 0;
        int llllllllllIlIIl = lIlI[1];
        while (llII(llllllllllIlIIl, lIlI[0])) {
            llllllllllIIlll += this.intArray[llllllllllIlIIl];
            llllllllllIlIIl++;
            "".length();
            if ((-" ".length()) >= "  ".length()) {
                return 0L;
            }
        }
        return llllllllllIIlll;
    }

    @Benchmark
    public long sumArrayList() {
        long lllllllllIllllI = 0;
        int llllllllllIIIII = lIlI[1];
        while (llII(llllllllllIIIII, lIlI[0])) {
            lllllllllIllllI += this.intList.get(llllllllllIIIII).intValue();
            llllllllllIIIII++;
            "".length();
            if ((-(130 ^ 134)) >= 0) {
                return 0L;
            }
        }
        return lllllllllIllllI;
    }

    public static void main(String[] lllllllllIlIIII) throws RunnerException {
        Options lllllllllIIllll = new OptionsBuilder().include(String.valueOf(new StringBuilder().append(lll[lIlI[1]]).append(JMHSample_39_MemoryAccess.class.getSimpleName()).append(lll[lIlI[2]]))).build();
        new Runner(lllllllllIIllll).run();
        "".length();
    }

    @Benchmark
    public long sumArrayListShuffled() {
        long lllllllllIlIlIl = 0;
        int lllllllllIlIlll = lIlI[1];
        while (llII(lllllllllIlIlll, lIlI[0])) {
            lllllllllIlIlIl += this.shuffledIntList.get(lllllllllIlIlll).intValue();
            lllllllllIlIlll++;
            "".length();
            if (((((142 + 13) - 67) + 91) ^ (((50 + 122) - 76) + 87)) == 0) {
                return 0L;
            }
        }
        return lllllllllIlIlIl;
    }

    private static void lIII() {
        lll = new String[lIlI[3]];
        lll[lIlI[1]] = I("cktCQ0yHnnI=", "vkeKb");
        lll[lIlI[2]] = lll("tSjxMtOj5fI=", "MNRTc");
    }

    private static String I(String llllllllIlllIIl, String llllllllIlllIII) {
        try {
            SecretKeySpec llllllllIllllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllIlllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlI[3], llllllllIllllII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllIlllIlI) {
            llllllllIlllIlI.printStackTrace();
            return null;
        }
    }

    private static boolean llII(int i, int i2) {
        return i < i2;
    }

    @Setup
    public void setup() {
        Random random = new Random(1234L);
        int lllllllllllIIlI = lIlI[1];
        while (llII(lllllllllllIIlI, lIlI[0])) {
            this.intArray[lllllllllllIIlI] = random.nextInt();
            this.intList.add(Integer.valueOf(this.intArray[lllllllllllIIlI]));
            "".length();
            this.shuffledIntList.add(Integer.valueOf(this.intArray[lllllllllllIIlI]));
            "".length();
            lllllllllllIIlI++;
            "".length();
            if ("  ".length() <= 0) {
                return;
            }
        }
        Collections.shuffle(this.shuffledIntList);
    }
}
