package my.perftest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = ApplicationConfig.class)
public class SpringJUnitTest {
    @Autowired
    LoadRunner testRunner;

    @Test
    public void test() {
        testRunner.go(Assert::assertTrue);
    }

}
