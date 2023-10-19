package com.example.demo.service;

import com.example.demo.domain.FormResponse;
import com.example.demo.domain.dto.FormDto;
import com.example.demo.domain.entity.Form;
import com.example.demo.repositroy.FormRepository;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class FormService {
    private final FormRepository formRepository;

    public FormService(FormRepository formRepository) {
        this.formRepository = formRepository;
    }

    public List<FormDto> getForm(Long id){
        List<Form> optForm =  formRepository.findByType(id);
        List<FormDto> listForm = optForm.stream()
                .map(m -> new FormDto(m.getId(), m.getType(), m.getTitle())) // stream, map?
                .collect(Collectors.toList()); // collect?
        return listForm;
    }
}
