package com.github.curriculeon;

/**
 * Created by leon on 8/4/2020.
 */
public final class Students extends People<Student> {
    private final static Students instance = new Students();

    public static Students getInstance() {
        return instance;
    }

    private Students() {
        Student star = new Student(0L, "Star");
        Student ezra = new Student(2L, "Ezra");
        Student nick = new Student(3L, "Nick");
        Student kyle = new Student(4L, "Kyle");

        add(star);
        add(ezra);
        add(nick);
        add(kyle);
    }

    @Override
    public Student[] toArray() {
        return personList.toArray(new Student[count()]);
    }
}