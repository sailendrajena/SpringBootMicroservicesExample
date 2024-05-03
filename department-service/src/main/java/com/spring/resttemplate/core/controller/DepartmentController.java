package com.spring.resttemplate.core.controller;

import com.spring.resttemplate.core.model.Department;
import com.spring.resttemplate.core.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dept/v1/")
public class DepartmentController {
    @Autowired
    private DepartmentService service;

    @PostMapping("create")
    public ResponseEntity<Department> saveDepartment(@RequestBody Department dept){
        Department department = service.saveDepartment(dept);
        return new ResponseEntity<>(department, HttpStatus.CREATED);
    }

    @GetMapping("fetch/{id}")
    public ResponseEntity<Department> getDepartmentById(@PathVariable("id") Long deptId){
        Department department = service.getDepartmentById(deptId);
        return ResponseEntity.ok(department);
    }

    //Fetch All Departments
    @GetMapping("fetchAll")
    public List<Department> getAllDepartments(){
        return service.getAllDepartments();
    }


}
