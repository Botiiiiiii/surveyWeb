package com.example.demo.domain.dto;

import com.example.demo.domain.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class UserDto {
    private Long id;
    private Long age;
    private String job;
    private String emailAddress;
    private Long surveyAgree;
    private Long indAgree;
    private String sex;

    public User toEntity() {
        return new User(this.id, this.age, this.job, this.emailAddress, this.surveyAgree, this.indAgree, this.sex);
    }
}
