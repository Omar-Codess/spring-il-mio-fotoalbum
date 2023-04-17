package learning.java.springilmiofotoalbum.repositories;

import learning.java.springilmiofotoalbum.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    public Optional<User> findByEmail(String email);
}
