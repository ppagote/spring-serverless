package com.pranav.springserverless.service;

import com.pranav.springserverless.entity.Book;
import com.pranav.springserverless.repository.BookRepository;
import lombok.AllArgsConstructor;

import java.util.function.Function;

@AllArgsConstructor
public class AddBook implements Function<Book, String> {

    private final BookRepository repository;

    @Override
    public String apply(Book book) {
        return repository.addBook(book);
    }
}
