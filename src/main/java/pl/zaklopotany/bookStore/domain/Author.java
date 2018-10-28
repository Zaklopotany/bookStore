package pl.zaklopotany.bookStore.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Author {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String surname;

    private int birthYear;

    @ManyToMany(mappedBy = "authors")
    private List<Book> books;




}
