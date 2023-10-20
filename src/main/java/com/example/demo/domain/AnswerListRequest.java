package com.example.demo.domain;

import com.example.demo.domain.dto.AnswerDto;
import com.example.demo.domain.entity.Answer;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@AllArgsConstructor
public class AnswerListRequest{
    private List<Answer> answers;

    public List<Answer> ListToEntity(List<AnswerDto> answers){
        return answers.stream()
                .map(AnswerDto::toEntity)
                .collect(Collectors.toList());
    }

}