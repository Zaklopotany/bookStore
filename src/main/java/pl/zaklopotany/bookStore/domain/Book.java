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

    private int publishedYear;

    private double price;


    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "book_author"
            , joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "author_id"))
    private List<Author> authors;


}
