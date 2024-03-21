package com.example.handleexceptiondemo.jackson;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.not;

import com.example.handleexceptiondemo.book.Book;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.junit.jupiter.api.Test;


public class JsonIgnoreTest {

    @Test
    void givenFieldAuthorIsIgnoredByName_whenDoIsSerialized_thenCorrect() throws
            JsonProcessingException {
        ObjectMapper objectMapper =  new ObjectMapper();
        Book book =  new Book();

        String bookAsString = objectMapper.writeValueAsString(book);

        assertThat(bookAsString, not(containsString("name")));
        System.out.println(bookAsString);
    }
}
