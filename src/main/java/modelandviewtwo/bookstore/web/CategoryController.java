package modelandviewtwo.bookstore.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import modelandviewtwo.bookstore.domain.Category;

@Controller
public class CategoryController {

@GetMapping("/categorylist")
public String getCategories(Model model) {
model.addAttribute("category", new Category());
return "addcategory";
}

}
