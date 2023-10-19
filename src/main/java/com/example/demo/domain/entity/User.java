package com.example.demo.domain.entity;

import com.example.demo.domain.dto.UserDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder
@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table (name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long age;
    private String job;
    private String emailAddress;
    private Long surveyAgree;
    private Long indAgree;
    private String sex;

    public static UserDto of(User user){
        return new UserDto(user.getId(),user.getAge(),user.getJob(),user.getEmailAddress(),user.getSurveyAgree(),user.getIndAgree(),user.getSex());
    }
}
