package com.github.perscholas.person;

import com.github.perscholas.utils.LoggerInterface;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leon on 9/2/2020.
 */
public class PersonServiceLogger implements LoggerInterface, PersonServiceInterface {
    private PersonServiceInterface serviceToBeLogged;

    public PersonServiceLogger(PersonServiceInterface serviceToBeLogged) {
        this.serviceToBeLogged = serviceToBeLogged;
    }

    @Override
    public Person create(Person person) {
        log("Attempting to create the following person\n\t %s", person.toString());
        Person persistedPerson = serviceToBeLogged.create(person);
        log("Successfully created the following person\n\t %s", person.toString());
        return persistedPerson;
    }

    @Override
    public Person readById(Long id) {
        log("Attempting to find person with id [ %s ]", id);
        Person personInDatabase = serviceToBeLogged.readById(id);
        log("Successfully found person with id [ %s ]\n\t %s", id, personInDatabase.toString());
        return personInDatabase;
    }

    @Override
    public List<Person> readAll() {
        log("Attempting to retrieve all persons from database");
        Iterable<Person> iterablePerson = serviceToBeLogged.readAll();
        log("Successfully retrieved all persons from database");
        List<Person> personList = new ArrayList<>();
        iterablePerson.forEach(personList::add);
        return personList;
    }

    @Override
    public Person update(Long idOfPersonToUpdate, Person newData) {
        Person personInDatabase = serviceToBeLogged.readById(idOfPersonToUpdate);
        log("Attempting to update person with id [ %s ] from\n\t %s \nto\n\t %s",
                idOfPersonToUpdate,
                personInDatabase,
                newData);
        personInDatabase = serviceToBeLogged.update(idOfPersonToUpdate, newData);
        log("Successfully updated person with id [ %s ] from\n\t %s \nto\n\t %s",
                idOfPersonToUpdate,
                personInDatabase,
                newData);
        return personInDatabase;
    }

    @Override
    public Person deleteById(Long idOfPersonToDelete) {
        log("Deleting person with id [ %s ]", idOfPersonToDelete);
        Person personToBeDeleted = serviceToBeLogged.deleteById(idOfPersonToDelete);
        log("Successfully deleted person with id [ %s ]", idOfPersonToDelete);
        return personToBeDeleted;
    }
}
