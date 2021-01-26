package com.example.demo.domain.model;

public interface Teacher {
    void teach(Learner learner, Double numberOfHours);
    void lecture(Learner[] learners, Double numberOfHours);
}
