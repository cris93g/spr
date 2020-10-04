package com.api.demo.Services;

import com.api.demo.Model.Book;

import java.util.List;

public interface BookService {
    List<Book> getBooks();

    void createBook(Book book);

    Book getBook(String title);
}
