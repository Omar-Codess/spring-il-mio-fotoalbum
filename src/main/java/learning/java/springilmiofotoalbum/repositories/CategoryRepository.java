package learning.java.springilmiofotoalbum.repositories;

import learning.java.springilmiofotoalbum.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
