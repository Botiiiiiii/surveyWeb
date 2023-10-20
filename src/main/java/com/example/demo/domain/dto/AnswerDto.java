package com.example.demo.domain.dto;

import com.example.demo.domain.entity.Answer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class AnswerDto {
    private Long id;
    private Long score;
    private Long formId;
    private Long formType;
    private Long userId;
    public Answer toEntity(){
        return new Answer(this.id, this.score,this.formId,this.userId,this.formType);
    }
}