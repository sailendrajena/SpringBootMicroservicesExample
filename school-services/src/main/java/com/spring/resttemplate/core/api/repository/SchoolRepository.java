package com.spring.resttemplate.core.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.resttemplate.core.api.model.School;

@Repository
public interface SchoolRepository extends JpaRepository<School, Long> {

}
