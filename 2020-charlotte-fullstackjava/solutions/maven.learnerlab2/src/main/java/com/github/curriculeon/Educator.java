package com.github.curriculeon;

/**
 * Created by leon on 8/4/2020.
 */
public enum Educator implements Teacher {
    LEON,
    HASEEB;

    private final Instructor instructor;
    private double timeWorked;

    Educator() {
        this.instructor = Instructors
                .getInstance()
                .findById((long) ordinal()-1);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        instructor.teach(learner, numberOfHours);
        timeWorked += numberOfHours;
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        instructor.lecture(learners, numberOfHours);
        timeWorked += numberOfHours;
    }

    public double getTimeWorked() {
        return timeWorked;
    }
}
