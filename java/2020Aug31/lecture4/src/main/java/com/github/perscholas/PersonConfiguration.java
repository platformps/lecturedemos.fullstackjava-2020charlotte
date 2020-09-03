package com.github.perscholas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.Date;

/**
 * Created by leon on 8/31/2020.
 */
@Configuration
public class PersonConfiguration {
    @Autowired
    private PersonRepository repository;

    @PostConstruct
    public void setup() {
        Person person1 = new Person();
        person1.setFirstName("Leon");
        person1.setLastName("Hunter");
        person1.setBirthDate(new Date());

        Person person2 = new Person();
        person2.setFirstName("Noel");
        person2.setLastName("Retnuh");
        person2.setBirthDate(new Date());

        repository.save(person1);
        repository.save(person2);
    }
}
