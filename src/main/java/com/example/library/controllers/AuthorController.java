package com.example.library.controllers;

import com.example.library.domains.dto.AuthorDto;
import com.example.library.domains.entities.AuthorEntity;
import com.example.library.mappers.Mapper;
import com.example.library.services.AuthorService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AuthorController {

    private final AuthorService authorService;
    private final Mapper<AuthorEntity, AuthorDto> mapper;

    public AuthorController(AuthorService authorService, Mapper<AuthorEntity, AuthorDto> mapper) {
        this.authorService = authorService;
        this.mapper = mapper;
    }

    @PostMapping(path = "/authors")
    public AuthorDto createAuthor(@RequestBody AuthorDto authorDto) {
       AuthorEntity authorEntity = mapper.mapFrom(authorDto);
       AuthorEntity savedAuthor = authorService.createAuthor(authorEntity);
       return mapper.mapTo(savedAuthor);
    }
}
