package modelandviewtwo.bookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import modelandviewtwo.bookstore.web.BookController;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class BookstoreApplication {

public static void main(String[] args) {
SpringApplication.run(BookstoreApplication.class, args);
}

@Bean
public CommandLineRunner bookdata(BookRepository bookrepository) {
return (args) -> {
Book b1 = new Book("A Farewell to Arms", "Ernest Hemingway", 1929, "1232323-21", "20.60 €");
Book b2 = new Book("Animal Farm", "George Orwell", 1945, "2212345-5", "14.95 €");
bookrepository.save(b1);
bookrepository.save(b2);
}
}

@Bean
public CommandLineRunner categorydata(CategoryRepository categoryrepository) {
return (args) -> {
Category c1 = new Category(1, "Scifi");
Category c2 = new Category(2, "Comic");
Category c3 = new Category(3, "Fiction");
categoryrepository.save(c1);
categoryrepository.save(c2);
categoryrepository.save(c3);
}
}

}