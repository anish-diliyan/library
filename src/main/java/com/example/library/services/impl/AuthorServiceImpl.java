package com.example.library.services.impl;

import com.example.library.domains.entities.AuthorEntity;
import com.example.library.repositories.AuthorRepository;
import com.example.library.services.AuthorService;
import org.springframework.stereotype.Service;


@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public AuthorEntity createAuthor(AuthorEntity authorEntity) {
        return authorRepository.save(authorEntity);
    }
}
