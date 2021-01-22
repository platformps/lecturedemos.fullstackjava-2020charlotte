package com.github.curriculeon;

/**
 * Created by leon on 8/4/2020.
 */
public final class Instructors extends People<Instructor> {
    private static Instructors instance;

    public static Instructors getInstance() {
        if(instance != null) {
            return instance;
        }
        return new Instructors();
    }

    private Instructors() {
        Instructor leon = new Instructor(0L, "Leon");
        Instructor haseeb = new Instructor(1L, "Haseeb");

        add(leon);
        add(haseeb);
    }

    @Override
    public Instructor[] toArray() {
        return this.personList.toArray(new Instructor[count()]);
    }
}
