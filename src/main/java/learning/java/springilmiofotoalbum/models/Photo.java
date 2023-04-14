package learning.java.springilmiofotoalbum.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.List;

@Entity
@Table(name = "templates/photos")
public class Photo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty
    @Size(min = 5, max = 255, message = "Name can not be greater than 5 or lesser than 255 chars")
    @Column(nullable = false)
    private String title;

    @NotEmpty
    @Size(min = 5, max = 10000, message = "Description can not to be greater than 10000 chars")
    @Column(nullable = false)
    private String description;


    @NotEmpty
    @Size(min = 5, max = 10000, message = "Photo Url can not to be greater than 10000 chars ")
    private String url;


    @NotNull
    @Column(nullable = false)
    private Boolean visible;

    @ManyToMany
    @JoinTable(name = "photo_category",
               joinColumns = @JoinColumn(name = "photo_id"),
               inverseJoinColumns = @JoinColumn(name = "category_id"))
    private List<Category> categories;

    public Photo() {
        super();
    }

    public Photo(Integer id, String title, String description, String url, Boolean visible) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.url = url;
        this.visible = visible;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public void setCategories(List<Category> categories){
        this.categories = categories;
    }

    public List<Category> getCategories(){
        return categories;
    }
}
