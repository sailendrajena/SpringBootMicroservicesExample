package com.spring.h2.core.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.h2.core.api.model.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {

}
