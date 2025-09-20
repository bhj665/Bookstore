package modelandviewtwo.bookstore.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

@GetMapping("/index")
public String getInformations(Model model) {
model.addAttribute("book", new Book());
return "bookinformations";
}

@Autowired
private BookRepository repository;

@RequestMapping("/booklist")
public String bookList(Model model) {
model.addAttribute("books", repository.findAll());
return "booklist";
}

}