package com.example.demo.domain.entity;

import com.example.demo.domain.dto.AnswerDto;
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
@Table (name = "answer")
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long score;
    private Long formType;
    @Column(name = "form_id")
    private Long formId;
    @Column(name = "user_id")
    private Long userId;

    public static AnswerDto of(Answer answer){
        return new AnswerDto(answer.getId(), answer.getScore(), answer.getFormId(), answer.getUserId(),answer.getFormType());
    }
}
