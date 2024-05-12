package com.example.library;

import com.example.library.domains.dto.AuthorDto;
import com.example.library.domains.dto.BookDto;

public class TestDataUtil {
    public static AuthorDto createAuthor() {
        return AuthorDto.builder().id(1L).name("Anish").age(20).build();
    }
    public static BookDto createBook() {
        return BookDto.builder().isbn("97-98-99").title("The Whale").author(createAuthor()).build();
    }
}
