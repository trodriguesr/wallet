package trodriguesr.com.github.wallet.repository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class UserRepositoryTest {
    @Autowired
    UserRepository userRepository;

    @Test
    public void testSave(){
        User user = new User();
        user.setName("Tiago");
        user.setPassword("123456");
        user.setEmail("tiago@tiago.net");

        User response = userRepository.save(user);
        Assert.assertNotNull(response);
    }



}
