package com.example.weeklyquestions.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.Arrays;

@Entity
public class Question {
    @Id
    @GeneratedValue
    private int id;
    private LocalDateTime creationDate;
    private String authorId;
    private String reviewerId;
    private String questionType;
    private String questionTopic;
    private String questionSubtopic;
    private int questionDifficulty;

    private String question;
    private String[] choices;
    private int[] answers;

    private String[] educationLinks;

    public Question(int id, LocalDateTime creationDate, String authorId, String reviewerId, String questionType, String questionTopic, String questionSubtopic, int questionDifficulty, String question, String[] choices, int[] answers, String[] educationLinks) {
        this.id = id;
        this.creationDate = creationDate;
        this.authorId = authorId;
        this.reviewerId = reviewerId;
        this.questionType = questionType;
        this.questionTopic = questionTopic;
        this.questionSubtopic = questionSubtopic;
        this.questionDifficulty = questionDifficulty;
        this.question = question;
        this.choices = choices;
        this.answers = answers;
        this.educationLinks = educationLinks;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public String getReviewerId() {
        return reviewerId;
    }

    public void setReviewerId(String reviewerId) {
        this.reviewerId = reviewerId;
    }

    public String getQuestionType() {
        return questionType;
    }

    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }

    public String getQuestionTopic() {
        return questionTopic;
    }

    public void setQuestionTopic(String questionTopic) {
        this.questionTopic = questionTopic;
    }

    public String getQuestionSubtopic() {
        return questionSubtopic;
    }

    public void setQuestionSubtopic(String questionSubtopic) {
        this.questionSubtopic = questionSubtopic;
    }

    public int getQuestionDifficulty() {
        return questionDifficulty;
    }

    public void setQuestionDifficulty(int questionDifficulty) {
        this.questionDifficulty = questionDifficulty;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String[] getChoices() {
        return choices;
    }

    public void setChoices(String[] choices) {
        this.choices = choices;
    }

    public int[] getAnswers() {
        return answers;
    }

    public void setAnswers(int[] answers) {
        this.answers = answers;
    }

    public String[] getEducationLinks() {
        return educationLinks;
    }

    public void setEducationLinks(String[] educationLinks) {
        this.educationLinks = educationLinks;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", creationDate=" + creationDate +
                ", authorId='" + authorId + '\'' +
                ", reviewerId='" + reviewerId + '\'' +
                ", questionType='" + questionType + '\'' +
                ", questionTopic='" + questionTopic + '\'' +
                ", questionSubtopic='" + questionSubtopic + '\'' +
                ", questionDifficulty=" + questionDifficulty +
                ", question='" + question + '\'' +
                ", choices=" + Arrays.toString(choices) +
                ", answers=" + Arrays.toString(answers) +
                ", educationLinks=" + Arrays.toString(educationLinks) +
                '}';
    }
}
