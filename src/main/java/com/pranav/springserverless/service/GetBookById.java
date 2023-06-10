package com.pranav.springserverless.service;

import com.pranav.springserverless.entity.Book;
import com.pranav.springserverless.repository.BookRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.function.Consumer;

@AllArgsConstructor
@Slf4j
public class GetBookById implements Consumer<Book> {

    private final BookRepository repository;


    @Override
    public void accept(Book bookId) {
        log.info("Book: {}", repository.getBookById(bookId.getId()));
    }
}
