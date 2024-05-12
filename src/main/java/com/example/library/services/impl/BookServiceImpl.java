package com.example.library.services.impl;

import com.example.library.domains.entities.BookEntity;
import com.example.library.repositories.BookRepository;
import com.example.library.services.BookService;
import org.springframework.stereotype.Service;


@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public BookEntity createBook(BookEntity book) {
        return bookRepository.save(book);
    }
}
