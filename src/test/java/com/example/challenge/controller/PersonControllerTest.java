package com.example.challenge.controller;

import com.example.challenge.model.Person;
import com.example.challenge.repository.PersonRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;

import java.util.List;

import static org.hibernate.Hibernate.get;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
@SpringBootTest
@AutoConfigureMockMvc
class PersonControllerTest {
    @Autowired
    private MockMvc mockMvc;
   /* @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    private PersonRepository personRepository;
    private List<Person> expectedPersons =List.of(
            new Person("gfgdhh",34,"donegal"),
            new Person("June",56,"Sligo")
    );

    @BeforeEach
    void populateDB(){
        personRepository.saveAll(expectedPersons);
    }*/


    @Test
    void testGetAllPerson() throws Exception {
        mockMvc.perform(get("/person"))
                .andExpect(status().isOk());

    }


}