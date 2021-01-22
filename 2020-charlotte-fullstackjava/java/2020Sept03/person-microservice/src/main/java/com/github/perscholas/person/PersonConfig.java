package com.github.perscholas.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.Date;

/**
 * Created by leon on 9/3/2020.
 */
@Configuration
public class PersonConfig {
    @Autowired
    private PersonRepository repository;

    @PostConstruct
    public void setup() {
        repository.saveAll(Arrays.asList(
                new PersonBuilder()
                        .setBirthDate(new Date())
                        .setFirstName("Leon")
                        .setLastName("Hunter")
                        .createPerson(),

                new PersonBuilder()
                        .setBirthDate(new Date())
                        .setFirstName("Noel")
                        .setLastName("Retnuh")
                        .createPerson(),

                new PersonBuilder()
                        .setBirthDate(new Date())
                        .setFirstName("Haseeb")
                        .setLastName("Muhammed")
                        .createPerson()));
    }

}
