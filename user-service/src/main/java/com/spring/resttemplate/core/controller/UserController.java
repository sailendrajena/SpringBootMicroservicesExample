package com.spring.resttemplate.core.controller;

import com.spring.resttemplate.core.dtos.ResponseDto;
import com.spring.resttemplate.core.model.User;
import com.spring.resttemplate.core.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user/v1/")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("create")
    public ResponseEntity<User> saveUser(@RequestBody User user) {
        User createUser = service.saveUser(user);
        return new ResponseEntity<>(createUser, HttpStatus.CREATED);
    }

    @GetMapping("all-users")
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }

    @GetMapping("fetch/{id}")
    public ResponseEntity<ResponseDto> getUser(@PathVariable("id") Long userId){
        ResponseDto responseDto = service.getUser(userId);
        return ResponseEntity.ok(responseDto);
    }
}
