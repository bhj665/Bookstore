package modelandviewtwo.bookstore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import modelandviewtwo.bookstore.domain.BookRepository;
import modelandviewtwo.bookstore.domain.CategoryRepository;
import modelandviewtwo.bookstore.domain.Book;
import modelandviewtwo.bookstore.domain.Category;

@SpringBootApplication
public class BookstoreApplication {
    private static final Logger log = LoggerFactory.getLogger(BookstoreApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(BookstoreApplication.class, args);
    }

@Bean
public CommandLineRunner bookdata(BookRepository bookrepository, CategoryRepository categoryrepository) {
return (args) -> {
log.info("Save more information of book");
categoryrepository.save(new Category(1, "Scifi"));
categoryrepository.save(new Category(2, "Comic"));
categoryrepository.save(new Category(3, "Fiction"));
bookrepository.save(new Book("A Farewell to Arms", "Ernest Hemingway", 1929, "1232323-21", "20.60 €", categoryrepository.findByName("Scifi").get(1)));
bookrepository.save(new Book("Animal Farm", "George Orwell", 1945, "2212345-5", "14.95 €", categoryrepository.findByName("Comic").get(2)));
log.info("More information of book has been saved");
}
}
}
