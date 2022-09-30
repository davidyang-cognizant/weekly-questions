package com.example.weeklyquestions.controllers;

import com.example.weeklyquestions.model.Question;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Arrays;

@RestController
public class QuestionController {

    @GetMapping("question/{id}")
    public Question getQuestion(@PathVariable int id){
        String[] choices = new String[]{"one", "two"};
        return new Question(id, LocalDateTime.now(), "959033", "", "multipleChoice", "android", "roomdb",3,  "What is a Dao", choices, new int[]{1}, new String[]{""});
    }
}
