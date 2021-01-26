package com.example.demo.domain.repos;

import com.example.demo.domain.model.Instructor;

/**
 * Created by leon on 7/27/2020.
 */
public class Instructors extends People<Instructor> {
    public Instructors(Instructor... personArray) {
        super(personArray);
    }

    @Override
    public Instructor[] toArray() {
        return super.personList.toArray(new Instructor[personList.size()]);
    }
}
