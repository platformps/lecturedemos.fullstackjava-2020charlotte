package com.github.perscholas.person;


import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by leon on 9/2/2020.
 */
public interface DefaultPersonServiceInterface extends PersonServiceInterface {

    default Logger getLogger() {
        return Logger.getLogger(getClass().getName());
    }

    default void info(String message, Object... args) {
        getLogger().log(Level.INFO, String.format(message, args));
    }

    PersonServiceInterface getRepository();

    @Override
    default Person create(Person person) {
        info("Attempting to create the following person\n\t %s", person.toString());
        Person persistedPerson = getRepository().create(person);
        info("Successfully created the following person\n\t %s", person.toString());
        return persistedPerson;
    }

    @Override
    default Person readById(Long id) {
        info("Attempting to find person with id [ %s ]", id);
        Person personInDatabase = getRepository().readById(id);
        info("Successfully found person with id [ %s ]\n\t %s", id, personInDatabase.toString());
        return personInDatabase;
    }

    @Override
    default List<Person> readAll() {
        info("Attempting to retrieve all persons from database");
        Iterable<Person> iterablePerson = getRepository().readAll();
        info("Successfully retrieved all persons from database");
        List<Person> personList = new ArrayList<>();
        iterablePerson.forEach(personList::add);
        return personList;
    }

    @Override
    default Person update(Long idOfPersonToUpdate, Person newData) {
        Person personInDatabase = readById(idOfPersonToUpdate);
        info("Attempting to update person with id [ %s ] from\n\t %s \nto\n\t %s",
                idOfPersonToUpdate,
                personInDatabase,
                newData);
        personInDatabase.setFirstName(newData.getFirstName());
        personInDatabase.setLastName(newData.getLastName());
        personInDatabase.setBirthDate(newData.getBirthDate());
        personInDatabase = getRepository().create(personInDatabase);
        info("Successfully updated person with id [ %s ] from\n\t %s \nto\n\t %s",
                idOfPersonToUpdate,
                personInDatabase,
                newData);
        return personInDatabase;
    }

    @Override
    default Person deleteById(Long idOfPersonToDelete) {
        Person personToBeDeleted = readById(idOfPersonToDelete);
        getRepository().deleteById(idOfPersonToDelete);
        return personToBeDeleted;
    }
}
