package my.perftest;

import org.junit.Assert;
import org.junit.Test;

public class OldJUnitTest {
    TestRunner testRunner = new TestRunner();

    @Test
    public void test() {
        testRunner.go(Assert::assertTrue);
    }

}
