package com.spring.unit.test.core.api.controller;

import com.spring.unit.test.core.api.entity.Person;
import com.spring.unit.test.core.api.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class PersonController {

    @Autowired
    private PersonService services;

    @GetMapping("persons")
    public ResponseEntity<List<Person>> getAllPerson(){
        return ResponseEntity.ok(services.getAllList());
    }
}
