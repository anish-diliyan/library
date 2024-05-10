package com.example.library.repositories;

import com.example.library.domains.entities.AuthorEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AuthorRepository extends CrudRepository<AuthorEntity, Long> {
}
