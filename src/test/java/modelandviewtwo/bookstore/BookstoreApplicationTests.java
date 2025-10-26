package modelandviewtwo.bookstore;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import modelandviewtwo.bookstore.web.BookController;
import modelandviewtwo.bookstore.web.CategoryController;

@SpringBootTest
class BookstoreApplicationTests {
    @Autowired
    private BookController bookcontroller;
    private CategoryController categorycontroller;

    @Test
    public void contextLoads() throws Exception {
        assertThat(bookcontroller).isNotNull();
        assertThat(categorycontroller).isNotNull();
    }
}
