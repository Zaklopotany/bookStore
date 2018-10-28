package pl.zaklopotany.bookStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.zaklopotany.bookStore.domain.Book;

public interface BookRepository extends JpaRepository<Book, Long> {


}
