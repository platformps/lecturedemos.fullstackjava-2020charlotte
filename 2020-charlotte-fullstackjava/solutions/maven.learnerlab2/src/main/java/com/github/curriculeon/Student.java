package com.github.curriculeon;

/**
 * Created by leon on 8/4/2020.
 */
public class Student extends Person implements Learner {
    private double totalStudyTime;

    public Student(long id, String name) {
        super(id, name);
    }

    @Override
    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    @Override
    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}
