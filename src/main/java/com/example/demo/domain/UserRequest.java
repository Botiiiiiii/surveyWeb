package com.example.demo.domain;

import com.example.demo.domain.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;


@Getter
@AllArgsConstructor
public class UserRequest {
    private Long Age;
    private String Job;
    private String EmailAddress;
    private Long SurveyAgree;
    private Long IndAgree;
    private String Sex;

    public User toEntity(){
        User user = User.builder()
                .age(this.Age)
                .job(this.Job)
                .emailAddress(this.EmailAddress)
                .surveyAgree(this.SurveyAgree)
                .indAgree(this.IndAgree)
                .sex(this.Sex)
                .build();
        return user;
    }
}