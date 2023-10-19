package com.example.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class AnswerResponse {
    private Long id;
    private Long score;
    private Long form_id;
    private Long user_id;
    private Long formType;
}
