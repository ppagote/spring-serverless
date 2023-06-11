package com.pranav.springserverless.functions;

import com.pranav.springserverless.entity.Book;
import com.pranav.springserverless.repository.BookRepository;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.function.Supplier;

@AllArgsConstructor
public class GetAllBooks implements Supplier<List<Book>> {

    private final BookRepository repository;

    @Override
    public List<Book> get() {
        return repository.allBooks();
    }
}
