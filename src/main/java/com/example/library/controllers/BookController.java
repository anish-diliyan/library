package com.example.library.controllers;

import com.example.library.domains.dto.BookDto;
import com.example.library.domains.entities.BookEntity;
import com.example.library.mappers.Mapper;
import com.example.library.services.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BookController {

    private final BookService bookService;

    private final Mapper<BookEntity, BookDto> mapper;

    public BookController(BookService bookService, Mapper<BookEntity, BookDto> mapper) {
        this.bookService = bookService;
        this.mapper = mapper;
    }

    @PostMapping("/books")
    public ResponseEntity<BookDto> createBook(@RequestBody BookDto bookDto) {
        BookEntity bookEntity = mapper.mapFrom(bookDto);
        BookEntity savedBook = bookService.createBook(bookEntity);
        return new ResponseEntity<>(mapper.mapTo(savedBook), HttpStatus.CREATED);
    }
}
