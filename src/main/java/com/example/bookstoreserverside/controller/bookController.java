package com.example.bookstoreserverside.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookstoreserverside.dto.BookDto;

@RestController
@RequestMapping("api/v1/books")
public class bookController {
    
    @GetMapping
    public ResponseEntity<List<BookDto>> getBooks(){
        BookDto book = BookDto.builder()
        .title("this is a book")
        .build();

        List<BookDto> books = new ArrayList<>();
        books.add(book);

        return ResponseEntity.ok(books);
    }
}