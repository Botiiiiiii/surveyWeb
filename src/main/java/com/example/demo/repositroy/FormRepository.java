package com.example.demo.repositroy;

import com.example.demo.domain.entity.Form;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FormRepository extends JpaRepository <Form, Long>{
    List<Form> findByType(Long id);
}