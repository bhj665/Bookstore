package modelandviewtwo.bookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class BookstoreApplication {

public static void main(String[] args) {
SpringApplication.run(BookstoreApplication.class, args);
}

@Bean
public CommandLineRunner bookdata(BookRepository repository) {
return (args) -> {
Book b1 = new Book("A Farewell to Arms", "Ernest Hemingway", 1929, "1232323-21", 20.60);
Book b2 = new Book("Animal Farm", "George Orwell", 1945, "2212345-5", 14.95);
repository.save(b1);
repository.save(b2);
}
}

}