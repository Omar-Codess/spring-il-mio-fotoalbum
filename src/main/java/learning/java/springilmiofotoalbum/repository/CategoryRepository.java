package learning.java.springilmiofotoalbum.repository;

import learning.java.springilmiofotoalbum.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
