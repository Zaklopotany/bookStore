package pl.zaklopotany.bookStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.zaklopotany.bookStore.domain.Book;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findAllBookWhereId(List<Long> Ids);

}
