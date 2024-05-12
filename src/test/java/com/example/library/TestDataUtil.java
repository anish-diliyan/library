package com.example.library;

import com.example.library.domains.dto.AuthorDto;

public class TestDataUtil {
    public static AuthorDto createAuthor() {
        return AuthorDto.builder().id(1L).name("Anish").age(20).build();
    }
}
