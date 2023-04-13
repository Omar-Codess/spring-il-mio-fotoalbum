package learning.java.springilmiofotoalbum.service;

import learning.java.springilmiofotoalbum.exceptions.PhotoNotFoundException;
import learning.java.springilmiofotoalbum.models.Photo;
import learning.java.springilmiofotoalbum.repository.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PhotoService {

    @Autowired
    PhotoRepository photoRepository;

    public Photo createPhoto(Photo formPhoto){

        Photo photoToSave = new Photo();

        photoToSave.setTitle(formPhoto.getTitle());
        photoToSave.setDescription(formPhoto.getDescription());
        photoToSave.setUrl(formPhoto.getUrl());
        photoToSave.setVisible(formPhoto.getVisible());
        photoToSave.setCategories(formPhoto.getCategories());
        return photoRepository.save(photoToSave);
    }

    public List<Photo> getAllPhotos(){
        return photoRepository.findAll(Sort.by("title"));
    }


    public List<Photo> getFilteredPhotos(String keyword){
        return photoRepository.findByTitleContainingIgnoreCase(keyword);
    }


    public Photo getById(Integer id) throws PhotoNotFoundException{
        Optional<Photo> result = photoRepository.findById(id);
        if (result.isPresent()){
            return result.get();
        } else {
            throw new PhotoNotFoundException(Integer.toString(id));
        }
    }

    public Photo updatePhoto(Photo photoForm, Integer id ) throws PhotoNotFoundException{
        Photo photoToUpdate = getById(id);
        photoToUpdate.setTitle(photoForm.getTitle());
        photoToUpdate.setDescription(photoForm.getDescription());
        photoToUpdate.setUrl(photoForm.getUrl());
        photoToUpdate.setVisible(photoForm.getVisible());
        photoToUpdate.setCategories(photoForm.getCategories());
        return photoRepository.save(photoForm);
    }

    public boolean deleteById(Integer id){
        photoRepository.findById(id).orElseThrow(() -> new PhotoNotFoundException((Integer.toString(id))));
        try {
            photoRepository.deleteById(id);
            return true;
        } catch (Exception e){
            return false;
        }
    }
}
