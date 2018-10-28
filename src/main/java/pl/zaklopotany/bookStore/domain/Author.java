package pl.zaklopotany.bookStore.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
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
