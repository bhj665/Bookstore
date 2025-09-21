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
private BookRepository bookrepository;

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