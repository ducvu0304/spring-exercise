package com.example.handleexceptiondemo.book;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @GetMapping("/{id}")
    public ResponseEntity<?> getBookById(@PathVariable("id") int id) {
        return new ResponseEntity<>(bookService.findBookById(id), HttpStatus.OK);
    }
}
