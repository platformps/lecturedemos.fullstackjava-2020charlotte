package com.github.perscholas.enums;

/**
 * Created by leon on 7/22/2020.
 */
public class Person {
    private static Integer numberOfPeople = 0;

    private Long id;
    private String firstName;
    private String lastName;
    private Integer age;
    private Day dayOfBirth;

    public Person() {
        numberOfPeople++;
        this.id = numberOfPeople.longValue();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
