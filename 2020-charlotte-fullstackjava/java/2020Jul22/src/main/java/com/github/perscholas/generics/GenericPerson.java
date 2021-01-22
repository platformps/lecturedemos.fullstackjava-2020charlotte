package com.github.perscholas.generics;

import java.util.Date;

/**
 * Created by leon on 7/22/2020.
 */
public class GenericPerson {
    public InstanceVariable<Date> birthdate;
    public InstanceVariable<String> firstName;
    public InstanceVariable<String> lastName;
    public InstanceVariable<Integer> age;

    public GenericPerson(String firstName, String lastName, Integer age, Date date) {
        this.firstName = new InstanceVariable(firstName);
        this.lastName = new InstanceVariable(lastName);
        this.age = new InstanceVariable(age);
        this.birthdate = new InstanceVariable(date);
    }
}
