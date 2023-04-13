package learning.java.springilmiofotoalbum.repository;

import learning.java.springilmiofotoalbum.models.Photo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PhotoRepository extends JpaRepository<Photo, Integer> {
    public List<Photo> findByTitleContainingIgnoreCase(String title);
}
