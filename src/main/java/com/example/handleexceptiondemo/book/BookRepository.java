package com.example.handleexceptiondemo.book;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class BookRepository {
    public static List<Book> books = new ArrayList<>();

    public BookRepository() {
        Book book1 = new Book(1, "Book 1", "Author 1");
        Book book2 = new Book(2, "Book 2", "Author 2");
        Book book3 = new Book(3, "Book 3", "Author 3");
        Book book4 = new Book(4, "Book 4", "Author 4");

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
    }
}
