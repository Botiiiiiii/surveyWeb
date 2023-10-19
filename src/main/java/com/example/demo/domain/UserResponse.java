package com.example.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UserResponse {
    private Long id;
    private Long age;
    private String job;
    private String emailAddress;
    private Long surveyAgree;
    private Long indAgree;
    private String sex;
}
