package com.example.demo.domain.entity;

import com.example.demo.domain.dto.FormDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "form")
public class Form {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long type;
    private String title;

    public static FormDto of(Form form) {
        return new FormDto(form.getId(), form.getType(), form.getTitle());
    }
}
