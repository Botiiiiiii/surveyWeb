package com.example.demo.controller;

import com.example.demo.domain.*;
import com.example.demo.domain.dto.AnswerDto;
import com.example.demo.domain.dto.FormDto;
import com.example.demo.domain.entity.Answer;
import com.example.demo.domain.entity.Form;
import com.example.demo.service.AnswerService;
import com.example.demo.service.FormService;
import com.example.demo.service.UserService;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api/v1/Form")
public class FormController {

    private final AnswerService answerService;
    private final UserService userService;
    private final FormService formService;

    public FormController(AnswerService answerService, UserService userService, FormService formService) {
        this.answerService = answerService;
        this.userService = userService;
        this.formService = formService;
    }

//    @PostMapping("/add2")
//    public String tttt(@RequestBody String data){
//        JSONObject parser = new JSONObject(data);
//
//        int i = 1;
//
//    }

    @PostMapping("/add")
    public ResponseEntity<AnswerResponse> addAnswer(@RequestBody AnswerRequest dto){

        AnswerResponse response = answerService.add(dto);
        return ResponseEntity.ok().body(response);
    }

    @PostMapping("/user/add")
    public ResponseEntity<UserResponse> addUser(UserRequest dto){
        UserResponse response = userService.add(dto);
            return ResponseEntity.ok().body(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<FormDto>> getForm(@PathVariable Long id){
        List<FormDto> formDto = formService.getForm(id);
        return ResponseEntity.ok().body(formDto);
    }

}
