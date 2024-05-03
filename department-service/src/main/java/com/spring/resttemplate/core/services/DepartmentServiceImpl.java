package com.spring.resttemplate.core.services;

import com.spring.resttemplate.core.model.Department;
import com.spring.resttemplate.core.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    private DepartmentRepository repo;

    @Override
    public Department saveDepartment(Department dept) {
        return repo.save(dept);
    }

    @Override
    public Department getDepartmentById(Long deptId) {
        return repo.findById(deptId).get();
    }

    @Override
    public List<Department> getAllDepartments() {
        return repo.findAll();
    }
}
