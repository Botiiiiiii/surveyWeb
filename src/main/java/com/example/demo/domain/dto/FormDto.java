package com.example.demo.domain.dto;

import com.example.demo.domain.entity.Form;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
@AllArgsConstructor
public class FormDto {
    private Long id;
    private Long type;
    private String title;

    public Form toEntity() {
        return new Form(this.id, this.type, this.title);
    }
}
