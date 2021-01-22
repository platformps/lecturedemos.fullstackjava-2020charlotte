package com.github.perscholas.objectrelations;

import java.util.Date;
import java.util.stream.Collectors;

/**
 * Created by leon on 8/6/2020.
 */
public class Person {
    private String name;
    public Date birthDate;

    public Person(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    } // getters and setter ommitted for brevity
}