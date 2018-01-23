package my.perftest;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

public class JUnit5Test {
    TestRunner testRunner = new TestRunner();

    @Test
    void test() {
        testRunner.go(Assertions::assertTrue);
    }
}
