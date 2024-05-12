package com.example.library.services;

import com.example.library.domains.entities.AuthorEntity;

import java.util.List;


public interface AuthorService {
    AuthorEntity createAuthor(AuthorEntity author);

    List<AuthorEntity> findAll();
}
