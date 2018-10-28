package pl.zaklopotany.bookStore.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Order {

    @Id
    @GeneratedValue
    private Long id;


    private double totalPrice;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_book")
    private List<Book> books = new ArrayList<>();

    public Order(List<Book> books) {
        this.books = books;
    }

    @Transient
    private double discount;


    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getDiscount() {
        return this.discount;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
