package pl.zaklopotany.bookStore.domain;


import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Book {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @ManyToMany(cascade =  {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "user_role"
            , joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "author_id"))
    private List<Author> authors;


}
