package com.github.perscholas.person;

import java.util.Date;

public class PersonBuilder {
    private Long id;
    private String firstName;
    private String lastName;
    private Date birthDate;

    public PersonBuilder setId(Long id) {
        this.id = id;
        return this;
    }

    public PersonBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public PersonBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public PersonBuilder setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    public Person createPerson() {
        return new Person(id, firstName, lastName, birthDate);
    }
}