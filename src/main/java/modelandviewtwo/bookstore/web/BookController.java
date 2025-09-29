package modelandviewtwo.bookstore.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import modelandviewtwo.bookstore.domain.BookRepository;
import modelandviewtwo.bookstore.domain.CategoryRepository;
import modelandviewtwo.bookstore.domain.Book;

@Controller
public class BookController {

@Autowired
private BookRepository bookrepository;

@GetMapping("/index")
public String getInformations(Model model) {
model.addAttribute("book", new Book());
return "bookinformations";
}

@RequestMapping("/booklist")
public String bookList(Model model) {
model.addAttribute("books", bookrepository.findAll());
return "booklist";
}

@Autowired
private CategoryRepository categoryrepository;

@RequestMapping("/categorylist")
public String categoryList(Model model) {
model.addAttribute("categories", categoryrepository.findAll());
return "categorylist";
}

}
