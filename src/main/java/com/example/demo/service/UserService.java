package com.example.demo.service;

import com.example.demo.domain.UserRequest;
import com.example.demo.domain.UserResponse;
import com.example.demo.domain.entity.User;
import com.example.demo.repositroy.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserResponse add(UserRequest dto){
        User user = dto.toEntity();
        User savedUser = userRepository.save(user);
        return new UserResponse(savedUser.getId(), savedUser.getAge(), savedUser.getJob(), savedUser.getEmailAddress(), savedUser.getSurveyAgree(), savedUser.getIndAgree(),savedUser.getSex());
    }
}