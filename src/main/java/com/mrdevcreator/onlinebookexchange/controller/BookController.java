package com.mrdevcreator.onlinebookexchange.controller;

import com.mrdevcreator.onlinebookexchange.model.Book;
import com.mrdevcreator.onlinebookexchange.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/book")
public class BookController {
    private final BookRepository bookRepository;
    @GetMapping("/list")
    public ModelAndView getBookList(){
        var mv  = new ModelAndView();
        List<Book> books = bookRepository.findAll();
        mv.addObject("bookList", books);
        mv.setViewName("bookList");
        return mv;
    }

}
