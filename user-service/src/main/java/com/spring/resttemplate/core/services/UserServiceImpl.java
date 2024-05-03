package com.spring.resttemplate.core.services;

import com.spring.resttemplate.core.dtos.DepartmentDto;
import com.spring.resttemplate.core.dtos.ResponseDto;
import com.spring.resttemplate.core.dtos.UserDto;
import com.spring.resttemplate.core.model.User;
import com.spring.resttemplate.core.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repo;

    @Autowired
    private RestTemplate template;

    @Override
    public User saveUser(User user) {
        return repo.save(user);
    }


    @Override
    public List<User> getAllUsers() {
        return repo.findAll();
    }

    @Override
    public ResponseDto getUser(Long userId) {
        ResponseDto responseDto = new ResponseDto();
        User user = repo.findById(userId).get();
        UserDto userDto = mapToUser(user);
        ResponseEntity<DepartmentDto> responseEntity = template.getForEntity("http://localhost:8080/api/dept/v1/fetch/" + userDto.getId(), DepartmentDto.class);

        DepartmentDto departmentDto = responseEntity.getBody();
        System.out.println(responseEntity.getStatusCode());

        responseDto.setUser(userDto);
        responseDto.setDepartment(departmentDto);

        return responseDto;
    }

    private UserDto mapToUser(User user) {
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        userDto.setEmail(user.getEmail());
        return userDto;
    }
}
