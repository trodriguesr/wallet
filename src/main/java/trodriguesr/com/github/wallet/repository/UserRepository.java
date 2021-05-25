package trodriguesr.com.github.wallet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import trodriguesr.com.github.wallet.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmailEquals(String email);
}
