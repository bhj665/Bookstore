package modelandviewtwo.bookstore;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import modelandviewtwo.bookstore.domain.Book;
import modelandviewtwo.bookstore.domain.BookRepository;

@DataJpaTest
public class BookRepositoryTests {
    @Autowired
    private BookRepository bookrepository;

    @Test
    public void findBookByTitle() {
        List<Book> books = bookrepository.findByTitle("A Farewell to Arms");
        assertThat(books).hasSize(1);
        assertThat(books.get(0).getAuthor()).isEqualTo("Ernest Hemingway");
    }

    @Test
    public void createBook() {
        Book book = new Book("Animal Farm", "George Orwell", 1945, "2212345-5", "14.95 €",
                categoryrepository.findByName("Comic").get(2));
        bookrepository.save(book);
        assertThat(book.getId()).isNotNull();
    }

    @Test
    public void deleteBook() {
        bookrepository.deleteByTitle("Animal Farm");
        assertThat(book.getId()).isNull();
    }
}
