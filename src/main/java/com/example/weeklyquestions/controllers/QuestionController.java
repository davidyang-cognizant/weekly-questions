package com.example.weeklyquestions.controllers;

import com.example.weeklyquestions.exceptions.UserNotFoundException;
import com.example.weeklyquestions.repository.QuestionRepository;
import com.example.weeklyquestions.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Optional;

@RestController
public class QuestionController {

    @Autowired
    QuestionRepository repository;


    @GetMapping("question/{id}")
    public Question getQuestion(@PathVariable int id){
        Optional<Question> question = repository.findById(id);
        if(question.isEmpty()){
            throw new UserNotFoundException("id: " + id);
        }
        return question.get();
    }

    @PostMapping("question")
    public ResponseEntity<Object> createQuestion(@RequestBody Question question){
        Question savedQuestion = repository.save(question);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest().path("/{id}")
                .buildAndExpand(savedQuestion.getId()).toUri();
        return ResponseEntity.created(location).build();
    }
}
