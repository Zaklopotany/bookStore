package pl.zaklopotany.bookStore.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Order  {

    @Id
    @GeneratedValue
    private Long id;


    private double totalPrice;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="id_book")
    private List<Book> books = new ArrayList<>();




}
