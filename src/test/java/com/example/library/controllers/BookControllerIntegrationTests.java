package com.example.library.controllers;

import com.example.library.TestDataUtil;
import com.example.library.domains.dto.BookDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
@AutoConfigureMockMvc
public class BookControllerIntegrationTests {

    private final MockMvc mockMvc;

    private final ObjectMapper objectMapper;

    @Autowired
    public BookControllerIntegrationTests(MockMvc mockMvc, ObjectMapper objectMapper) {
        this.mockMvc = mockMvc;
        this.objectMapper = objectMapper;
    }

//    @Test
//    public void testCreateBookHaveCreatedStatusCodeAndValidResponse() throws Exception {
//        BookDto bookDto = TestDataUtil.createBook();
//        String book = objectMapper.writeValueAsString(bookDto);
//        ResultActions resultAction = mockMvc.perform(
//                MockMvcRequestBuilders.post("/books")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(book)
//        );
//        resultAction.andExpect(
//                MockMvcResultMatchers.status().isCreated()
//        ).andExpect(
//                MockMvcResultMatchers.jsonPath("$.author").value(bookDto.getAuthor())
//        ).andExpect(
//                MockMvcResultMatchers.jsonPath("$.isbn").value(bookDto.getIsbn())
//        );
//    }
}

