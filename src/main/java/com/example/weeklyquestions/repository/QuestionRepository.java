package com.example.weeklyquestions.repository;

import com.example.weeklyquestions.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
}
