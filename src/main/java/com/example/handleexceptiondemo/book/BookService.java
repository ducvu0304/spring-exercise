package com.example.handleexceptiondemo.book;

import com.example.handleexceptiondemo.common.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public Book findBookById(int id) {

        return BookRepository.books.stream()
                .filter(b -> b.getId() == id)
                .findFirst()
                .orElseThrow(() -> new ResourceNotFoundException("Book not found"));
    }
}
