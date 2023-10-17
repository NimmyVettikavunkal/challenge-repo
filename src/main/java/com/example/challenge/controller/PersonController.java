package com.example.challenge.controller;

import com.example.challenge.model.Person;
import com.example.challenge.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {
    @Autowired
    private PersonRepository personRepository;
    @GetMapping("/person")
    public List<Person> getAllPerson(){
        return personRepository.findAll();
    }
}
