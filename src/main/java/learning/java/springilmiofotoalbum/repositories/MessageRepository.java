package learning.java.springilmiofotoalbum.repositories;

import learning.java.springilmiofotoalbum.models.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Integer> {
}
