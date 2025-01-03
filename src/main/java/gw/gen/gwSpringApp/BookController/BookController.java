package gw.gen.gwSpringApp.BookController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import gw.gen.gwSpringApp.services.BookService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping("/books")
    public String requestMethodName(@RequestParam String param) {
        return new String();
    }
    
    public String getBooks(Model model) {
        model.addAttribute("books", bookService.findAll());
        return "books";
    }

}
