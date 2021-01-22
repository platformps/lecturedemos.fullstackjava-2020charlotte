package com.github.perscholas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

/**
 * Created by leon on 9/3/2020.
 */
@Configuration
public class PersonConfig {
    @Autowired
    private PersonRepository repository;

    @Bean
    public PersonService personService() {
        return new PersonService(repository);
    }

    @PostConstruct
    public void setup() {
        personService().create(new Person());
        personService().create(new Person());
        personService().create(new Person());
        personService().create(new Person());
    }
}
