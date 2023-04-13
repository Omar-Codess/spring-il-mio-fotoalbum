package learning.java.springilmiofotoalbum.service;

import learning.java.springilmiofotoalbum.exceptions.CategoryNotFoundException;
import learning.java.springilmiofotoalbum.models.Category;
import learning.java.springilmiofotoalbum.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAll(){
        return categoryRepository.findAll();
    }

    public Category create(Category formCategories){
        Category categoryToCreate = new Category();
        categoryToCreate.setName(formCategories.getName());
        return categoryRepository.save(categoryToCreate);
    }


    public Category getById(Integer id) throws CategoryNotFoundException {
        Optional<Category> result = categoryRepository.findById(id);
        if (result.isPresent()){
            return result.get();
        } else {
            throw new CategoryNotFoundException(Integer.toString(id));
        }
    }

    public Category update(Category formCategories, Integer id){
        Category categoryToUpdate = new Category();
        categoryToUpdate.setName(formCategories.getName());
        return categoryRepository.save(categoryToUpdate);

    }


    public boolean deleteById(Integer id){
        categoryRepository.findById(id).orElseThrow(() -> new CategoryNotFoundException(Integer.toString(id)));
        try {
            categoryRepository.deleteById(id);
            return true;
        } catch (Exception e){
            return false;
        }
    }
}
