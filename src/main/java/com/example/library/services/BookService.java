package com.example.library.services;

import com.example.library.domains.entities.BookEntity;

public interface BookService {
    BookEntity createBook(BookEntity book);
}
