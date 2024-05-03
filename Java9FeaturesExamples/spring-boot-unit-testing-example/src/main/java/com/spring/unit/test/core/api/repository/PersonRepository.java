package com.spring.unit.test.core.api.repository;

import com.spring.unit.test.core.api.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
    Boolean existById(Integer id);
}
