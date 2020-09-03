package com.github.perscholas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.Date;

/**
 * Created by leon on 9/1/2020.
 */
@Configuration
public class PersonConfig {
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

        Person person3 = new Person();
        person3.setFirstName("Leon");
        person3.setLastName("Christopher");
        person3.setBirthDate(new Date());

        repository.save(person1);
        repository.save(person2);
        repository.save(person3);
    }
}
