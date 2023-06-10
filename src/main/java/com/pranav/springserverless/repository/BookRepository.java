package com.pranav.springserverless.repository;

import com.pranav.springserverless.entity.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BookRepository {

    private static List<Book> bookList = new ArrayList<>();

    static {
        bookList.add(Book.builder().id("1").name("Pranav").build());
        bookList.add(Book.builder().id("2").name("Dhana").build());
    }

    public List<Book> allBooks() {
        return bookList;
    }

    public String addBook(Book book) {
        bookList.add(book);
        return "added to List";
    }

    public Book getBookById(String id) {
        return bookList.stream()
                .filter(bookId -> bookId.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Book not found"));
    }
}
