package learning.java.springilmiofotoalbum.services;

import learning.java.springilmiofotoalbum.exceptions.CategoryNotFoundException;
import learning.java.springilmiofotoalbum.models.Category;
import learning.java.springilmiofotoalbum.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAllCategories() {
        return categoryRepository.findAll(Sort.by("name"));
    }

    public Category createCategory(Category formCategory) {

        Category categoryToPersist = new Category();
        categoryToPersist.setName(formCategory.getName());

        return categoryRepository.save(categoryToPersist);
    }

    public boolean deleteById(Integer id) throws CategoryNotFoundException {

        categoryRepository.findById(id).orElseThrow(() -> new CategoryNotFoundException(Integer.toString(id)));

        try {
            categoryRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

}

