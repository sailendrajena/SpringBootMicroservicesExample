package com.spring.unit.test.core.api.services;

import com.spring.unit.test.core.api.entity.Person;
import com.spring.unit.test.core.api.repository.PersonRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.BDDMockito.verify;
import static org.mockito.BDDMockito.given;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class PersonServiceTest {

    @Mock
    private PersonRepository repo;

    @InjectMocks
    private PersonService services;

    @Test
    void getAllPerson() {

        //This is given input
        Person person1 = new Person(131, "Saiendra1", "Rourkela");
        Person person2 = new Person(132, "Saiendra2", "Bangalore");

        //When input
        given(repo.findAll())
                .willReturn(List.of(person1,person2));
        var  personList = services.getAllList();
        //Then
        //Make sure to import assertThat From org.assertj.core.api package
        assertThat(personList).isNotNull();
        assertThat(personList.size()).isEqualTo(2);
    }
}
