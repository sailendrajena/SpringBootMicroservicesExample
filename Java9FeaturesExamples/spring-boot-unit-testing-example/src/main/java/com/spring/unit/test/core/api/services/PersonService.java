package com.spring.unit.test.core.api.services;

import com.spring.unit.test.core.api.entity.Person;
import com.spring.unit.test.core.api.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository repo;

    public List<Person> getAllList(){
        return repo.findAll();
    }

}
