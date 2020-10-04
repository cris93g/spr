package com.api.demo.Services.implementation;

import com.api.demo.Model.Book;
import com.api.demo.Services.BookService;
import com.api.demo.dao.BookRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImplementation implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImplementation(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    @Override
    public List<Book> getBooks() {
        List<Book> returnValue = new ArrayList<Book>();
        returnValue= (List<Book>) bookRepository.findAll();
        return returnValue;
    }

    @Override
    public void createBook(Book book) {
        bookRepository.save(book);
    }

    @Override
    public Book getBook(String title) {
       Book returnValue=bookRepository.findByTitle(title);
       return returnValue;
    }

}
