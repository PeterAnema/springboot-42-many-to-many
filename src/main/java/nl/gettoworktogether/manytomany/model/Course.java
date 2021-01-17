package nl.gettoworktogether.manytomany.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Course {

    @Id
    Long id;

    @ManyToMany(mappedBy = "likedCourses")
    Set<Student> likes = new HashSet<>();

    // additional properties
    // standard constructors, getters, and setters

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Set<Student> getLikes() {
        return likes;
    }
    public void setLikes(Set<Student> likes) {
        this.likes = likes;
    }

}