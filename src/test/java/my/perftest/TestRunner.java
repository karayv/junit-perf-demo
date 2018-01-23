package my.perftest;

import java.time.Duration;
import java.util.function.Consumer;

public class TestRunner {
    private Duration printThreshhold = Duration.ofMillis(100);
    private Duration stopThreshhold = Duration.ofMillis(1000);

    private Library service = new Library();

    public void go(Consumer<Boolean> assertTrue) {
        Duration duration = Duration.ZERO;

        for (int levelOfLoad = 5; stopThreshhold.compareTo(duration) > 0; levelOfLoad++) {
            int load = 1 << levelOfLoad;

            // run the check
            long start = System.currentTimeMillis();
            for (int i1 = 0; i1 < load; i1++) {
                for (int i2 = 0; i2 < load; i2++) {
                    assertTrue.accept(service.sum2(i1, i2) >= 0);
                }
            }
            duration = Duration.ofMillis(System.currentTimeMillis() - start);

            if (duration.compareTo(printThreshhold) > 0) {
                System.out.printf("Level of load: %d, duration: %s, number of operations: %d\n", levelOfLoad, duration,
                        (long) load * load);
            }
        }
    }

}
