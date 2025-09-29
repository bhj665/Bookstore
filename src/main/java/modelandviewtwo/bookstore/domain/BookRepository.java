package modelandviewtwo.bookstore.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, String> {
List<Book> findByAuthor(String author);
}
