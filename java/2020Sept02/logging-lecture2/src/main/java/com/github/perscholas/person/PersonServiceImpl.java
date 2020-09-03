package com.github.perscholas.person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leon on 9/2/2020.
 */
public class PersonService implements PersonServiceInterface {
    private List<Person> repository;

    public PersonService(List<Person> repository) {
        this.repository = repository;
    }

    public PersonService() {
        this(new ArrayList<>());
    }

    @Override
    public Person create(Person person) {
        repository.add(person);
        return person;
    }

    @Override
    public Person readById(Long id) {
        return repository
                .stream()
                .filter(person -> person.getId().equals(id))
                .findFirst()
                .get();
    }

    @Override
    public List<Person> readAll() {
        return repository;
    }

    @Override
    public Person update(Long idOfPersonToUpdate, Person newData) {
        Person personInDatabase = readById(idOfPersonToUpdate);
        personInDatabase.setFirstName(newData.getFirstName());
        personInDatabase.setLastName(newData.getLastName());
        personInDatabase.setBirthDate(newData.getBirthDate());
        return personInDatabase;
    }

    @Override
    public Person deleteById(Long idOfPersonToDelete) {
        Person personToBeDeleted = readById(idOfPersonToDelete);
        repository.remove(personToBeDeleted);
        return personToBeDeleted;
    }
}
