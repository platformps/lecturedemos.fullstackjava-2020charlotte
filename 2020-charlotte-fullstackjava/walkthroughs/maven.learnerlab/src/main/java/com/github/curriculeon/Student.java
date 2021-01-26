package com.github.curriculeon;

/**
 * Created by leon on 7/21/2020.
 */
public class Student extends Person implements Learner {
    private double totalStudyTime;

    public Student(Long id, String name) {
        super(id, name);
    }

    @Override
    public void learn(Double numberOfHours) {
        this.totalStudyTime =  totalStudyTime + numberOfHours;
    }

    @Override
    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}
