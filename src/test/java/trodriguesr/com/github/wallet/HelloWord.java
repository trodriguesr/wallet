package trodriguesr.com.github.wallet;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloWord {
    @Test
    public void testHelloWord(){
        Assert.assertEquals(1,1);
    }

}
