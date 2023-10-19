package com.example.demo.service;

import com.example.demo.domain.AnswerRequest;
import com.example.demo.domain.AnswerResponse;
import com.example.demo.domain.entity.Answer;
import com.example.demo.repositroy.AnswerRepository;
import org.springframework.stereotype.Service;

@Service
public class AnswerService {
    private final AnswerRepository answerRepository;

    public AnswerService(AnswerRepository answerRepository) {
        this.answerRepository = answerRepository;
    }

    public AnswerResponse add(AnswerRequest dto){
        Answer answer = dto.toEntity();
        Answer savedAnswer = answerRepository.save(answer);
        return new AnswerResponse(savedAnswer.getId(), savedAnswer.getScore(), savedAnswer.getFormId(), savedAnswer.getUserId(),savedAnswer.getFormType());
    }
}
