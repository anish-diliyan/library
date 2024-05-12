package com.example.library.domains.entities;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "books")
//No Getter: You will get null values in response
@Getter
// No @Setter: must be manually assigned before calling 'persist()'
@Setter
// Not @NoArgsConstructor: Failed to instantiate instance of destination BookEntity.
@NoArgsConstructor
public class BookEntity {

    @Id
    private String isbn;

    private String title;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "author_id")
    private AuthorEntity author;
}
