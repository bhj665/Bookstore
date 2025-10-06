package modelandviewtwo.bookstore.web;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;
import modelandviewtwo.bookstore.domain.Book;
import modelandviewtwo.bookstore.domain.BookRepository;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class BookRestController {

    @Autowired
    private BookRepository bookrepository;

    @RequestMapping(value = "/books", method = RequestMethod.GET)
    public @ResponseBody List<Book> getBooksRest() {
        return (List<Book>) bookrepository.findAll();
    }

    @RequestMapping(value = "/books/{id}", method = RequestMethod.GET)
    public @ResponseBody Optional<Book> findBookRest(@PathVariable("id") Long dId) {
        return bookrepository.findById(dId);
    }

}
