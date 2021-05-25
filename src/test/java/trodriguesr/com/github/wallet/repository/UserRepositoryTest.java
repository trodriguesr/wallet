package trodriguesr.com.github.wallet.repository;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import trodriguesr.com.github.wallet.entity.User;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("application-test.properties")
public class UserRepositoryTest {

    private static final String EMAIL = "email@teste.com";

    @Before
    public void setUp(){
        User user = new User();
        user.setName("Set Up User");
        user.setPassword("senha");
        user.setEmail(EMAIL);
        userRepository.save(user);
    }

    @After
    public void tearDown(){
        userRepository.deleteAll();

    }
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

    @Test
    public void findByEmail(){
        Optional<User> response = userRepository.findByEmailEquals(EMAIL);
        Assert.assertTrue(response.isPresent());
        Assert.assertEquals(response.get().getEmail(), EMAIL);

    }



}
