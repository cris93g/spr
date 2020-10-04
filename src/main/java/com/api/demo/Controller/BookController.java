package com.api.demo.Controller;

import com.api.demo.Model.Book;
import com.api.demo.Services.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<Book> getBooks(){
        List<Book> returnValue= bookService.getBooks();
        return returnValue;
    }

    @GetMapping(path="/{title}")
    public Book getBook(@PathVariable String title){
        Book returnValue = bookService.getBook(title);
        return returnValue;
    }

    @PostMapping
    public void createBook(@RequestBody Book book){
        bookService.createBook(book);
    }

    @PutMapping
    public void updateBook(){}

    @DeleteMapping
    public void deleteBook(){}

}
