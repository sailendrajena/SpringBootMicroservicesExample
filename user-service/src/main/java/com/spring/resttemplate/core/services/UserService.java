package com.spring.resttemplate.core.services;

import com.spring.resttemplate.core.dtos.ResponseDto;
import com.spring.resttemplate.core.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    User saveUser(User user);

    List<User> getAllUsers();

    ResponseDto getUser(Long userId);
}
