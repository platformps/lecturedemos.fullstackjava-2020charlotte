package com.github.curriculeon;

/**
 * Created by leon on 8/4/2020.
 */
public class Instructor extends Person implements Teacher {
    public Instructor(long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        double numberOfHourPerLearner = numberOfHours / learners.length;
        for (int i = 0; i < learners.length; i++) {
            Learner learner = learners[i];
            teach(learner, numberOfHourPerLearner);
        }
    }
}
