package com.example.demo.domain;

import com.example.demo.domain.entity.Answer;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class AnswerRequest {
    private Long Score;
    private Long FormId;
    private Long UserId;
    private Long FormType;

    public Answer toEntity(){
        Answer answer = Answer.builder()
                .score(this.Score)
                .formId(this.FormId)
                .userId(this.UserId)
                .formType(this.FormType)
                .build();
        return answer;
    }
}