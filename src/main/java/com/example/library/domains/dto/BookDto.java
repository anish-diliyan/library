package com.example.library.domains.dto;


import lombok.*;

//Builder needed All arg constructor
@AllArgsConstructor
// to build object using builder pattern in TestDataUtil
@Builder
//No @Setter: you will get null values in response
@Setter
//No @Getter: BookEntity must be manually assigned before calling 'persist()'
@Getter
// No @NoArgsConstructor: BookDto has a non-private no-argument constructor.(Model Mapper Error)
@NoArgsConstructor
public class BookDto {

    private String isbn;

    private String title;

    private AuthorDto author;
}
