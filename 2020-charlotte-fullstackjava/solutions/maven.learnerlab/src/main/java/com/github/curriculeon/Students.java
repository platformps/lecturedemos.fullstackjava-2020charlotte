package com.github.curriculeon;

import java.util.List;

/**
 * Created by leon on 7/27/2020.
 * existing independent of an instance of the class that defines it
 */
public class Students extends People<Student> {
    private static final Students instance = new Students();

    //private constructor to avoid client applications to use constructor
    private Students(){
        super(); // optional invocation
        this.add(new Student(0L, "Julia"));
        this.add(new Student(1L, "David Y"));
        this.add(new Student(2L, "Ghasan"));
    }


    @Override
    public Student[] toArray() {
        int sizeOfArray = count();
        Student[] destinationArray = new Student[sizeOfArray];
        List<Student> sourceList = personList;
        return sourceList.toArray(destinationArray);
    }

    public static Students getInstance(){
        return instance;
    }
}
