package com.github.perscholas;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Date;

//class Person {
//    constructor(id, fname, lname, birthdate) {
//        this.id = id;
//        this.fname = fname;
//        this.lname = lname;
//        this.birthdate = birthdate;
//    }
//}
public class Person {
    public String fname;
    public String lname;
    public Date birthdate;

    Person(String fname, String lname, Date birthdate) {
        this.fname = fname;
        this.lname =lname;
        this.birthdate=birthdate;
    }

    public String toString() {
        try {
            return new ObjectMapper().writeValueAsString(this);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
