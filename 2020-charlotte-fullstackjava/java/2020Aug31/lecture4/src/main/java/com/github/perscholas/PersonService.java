package com.github.perscholas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leon on 8/31/2020.
 */
@Service
public class PersonService {
    private PersonRepository repository;

    @Autowired
    public PersonService(PersonRepository repository) {
        this.repository = repository;
    }

    public List<Person> getAll() {
        Iterable<Person> personIterable = repository.findAll();
        List<Person> personList = new ArrayList<>();
        personIterable.forEach(personList::add);
        return personList;
    }
}
