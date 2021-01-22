package com.github.perscholas;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leon on 9/3/2020.
 */
public class PersonService {
    private PersonRepository repository;

    public PersonService(PersonRepository repository) {
        this.repository = repository;
    }

    public Person create(Person person) {
        return repository.save(person);
    }

    public Person readById(Long id) {
        return repository.findById(id).get();
    }

    public List<Person> readAll() {
        List<Person> personList = new ArrayList<>();
        for (Person person : repository.findAll()) {
            personList.add(person);
        }
        return personList;
    }

    public Person update(Long id, Person newData) {
        Person personInDatabase = readById(id);
        personInDatabase.setFirstName(newData.getFirstName());
        personInDatabase.setLastName(newData.getLastName());
        personInDatabase.setBirthDate(newData.getBirthDate());
        repository.save(personInDatabase);
        return personInDatabase;
    }

    public Person delete(Person person) {
        repository.delete(person);
        return person;
    }

    public Person deleteById(Long id) {
        return delete(readById(id));
    }
}
