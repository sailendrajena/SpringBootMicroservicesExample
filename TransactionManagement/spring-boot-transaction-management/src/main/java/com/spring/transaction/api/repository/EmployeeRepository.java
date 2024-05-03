package com.spring.transaction.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.transaction.api.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
