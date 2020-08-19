package com.github.perscholas;

/**
 * Created by leon on 8/19/2020.
 */
public class Person {

    private String firstName;

    public Person() {
        this.firstName = "Something else";
    }

    public Person(Long id, String firstName, String lastName) {
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }
}
