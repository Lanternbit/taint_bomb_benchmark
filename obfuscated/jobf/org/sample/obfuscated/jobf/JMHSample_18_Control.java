package org.sample;

import java.util.concurrent.atomic.AtomicBoolean;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Group;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.infra.Control;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

@State(Scope.Group)
/* loaded from: test.jar:org/sample/JMHSample_18_Control.class */
public class JMHSample_18_Control {
    public final /* synthetic */ AtomicBoolean flag = new AtomicBoolean();
    private static /* synthetic */ boolean[] lll = null;
    private static int[] llll = null;

    private static boolean ll(int i) {
        return i == 0;
    }

    public static void main(String[] llllllllllIIlll) throws RunnerException {
        Options llllllllllIIllI = new OptionsBuilder().include(JMHSample_18_Control.class.getSimpleName()).threads(llll[2]).forks(llll[1]).build();
        new Runner(llllllllllIIllI).run();
        "".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    @Group("pingpong")
    @Benchmark
    public void pong(Control control) {
        while (ll(control.stopMeasurement ? 1 : 0) && ll(this.flag.compareAndSet(lll[1], lll[0]) ? 1 : 0)) {
            "".length();
            if (((124 ^ 35) & ((69 ^ 26) ^ (-1))) != 0) {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    @Group("pingpong")
    @Benchmark
    public void ping(Control control) {
        while (ll(control.stopMeasurement ? 1 : 0) && ll(this.flag.compareAndSet(lll[0], lll[1]) ? 1 : 0)) {
            "".length();
            if ("   ".length() == 0) {
                return;
            }
        }
    }

    static {
        l();
    }

    private static void l() {
        lll = new boolean[3];
        llll = new int[3];
        lll[0] = ((213 ^ 197) & ((25 ^ 9) ^ (-1))) == 16;
        lll[1] = (" ".length() == 1);
        llll[1] = " ".length();
        llll[2] = "  ".length();
    }
}
