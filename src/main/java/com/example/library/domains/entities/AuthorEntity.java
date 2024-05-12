package com.example.library.domains.entities;

import jakarta.persistence.*;
import lombok.*;


@Builder
@Entity
@Table(name = "authors")
//No Getter: You will get null values in response
@Getter
// No @Setter: must be manually assigned before calling 'persist()'
@Setter
//Not AllArgsConstructor: Lombok @Builder needs a proper constructor for this class
@AllArgsConstructor
// Not @NoArgsConstructor: Failed to instantiate instance of destination BookEntity.
@NoArgsConstructor
public class AuthorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "author_id_seq")
    private Long id;

    private String name;

    private Integer age;

}
