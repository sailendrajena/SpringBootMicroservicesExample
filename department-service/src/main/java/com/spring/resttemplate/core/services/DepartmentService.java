package com.spring.resttemplate.core.services;

import com.spring.resttemplate.core.model.Department;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DepartmentService {
    Department saveDepartment(Department dept);
    Department getDepartmentById(Long deptId);

    List<Department> getAllDepartments();
}
