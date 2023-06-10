package com.pranav.springserverless;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@Slf4j
//@AllArgsConstructor
public class SpringServerlessApplication   {

    //private final BookRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(SpringServerlessApplication.class, args);
    }



    /*@Bean
    public Function<Book, String> addBook() {
        return repository::addBook;
    }*/

    /*@Bean
    public Supplier<List<Book>> getAllBooks() {
        return repository::allBooks;
    }*/

    /*@Bean
    public Consumer<String> getBookById() {
        return input -> log.info("{}", repository.getBookById(input));
    }*/
}
