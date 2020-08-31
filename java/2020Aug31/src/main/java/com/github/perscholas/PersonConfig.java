package com.github.perscholas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.Date;

/**
 * Created by leon on 8/31/2020.
 */
@Configuration
public class PersonConfig {
    @Autowired
    private PersonRepository personRepository;

    @PostConstruct
    public void setup() {
        Person person1 = new Person();
        person1.setFirstName("Noel");
        person1.setLastName("Retnuh");
        person1.setBirthDate(new Date());

        Person person2 = new Person();
        person2.setFirstName("Leon");
        person2.setLastName("Hunter");
        person2.setBirthDate(new Date());

        personRepository.save(person1);
        personRepository.save(person2);
    }
}
