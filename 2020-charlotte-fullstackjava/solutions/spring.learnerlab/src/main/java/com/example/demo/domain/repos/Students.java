package com.example.demo.domain.repos;

import com.example.demo.domain.model.Student;

/**
 * Created by leon on 7/27/2020.
 * existing independent of an instance of the class that defines it
 */
public class Students extends People<Student> {
    public Students(Student... students) {
        super(students);
    }

    @Override
    public Student[] toArray() {
        return super.personList.toArray(new Student[personList.size()]);
    }
}
