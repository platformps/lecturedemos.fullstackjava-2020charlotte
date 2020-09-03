package com.github.perscholas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leon on 9/1/2020.
 */
@Service
public class PersonService {

    private PersonRepository personRepo;
    private UserRepository userRepo;

    @Autowired
    public PersonService(UserRepository userRepository, PersonRepository repository) {
        this.personRepo = repository;
        this.userRepo = userRepository;
    }


    public Person create(Person person) {
        Person persistedPerson = personRepo.save(person);
        return persistedPerson;
    }

    public Person readById(Long id) {
        return personRepo.findById(id).get();
    }

    public List<Person> readAll() {
        Iterable<Person> personIterable = personRepo.findAll();
        List<Person> personList = new ArrayList<>();
        personIterable.forEach(personList::add);
        return personList;
    }

    public Person updateById(Long id, Person newData) {
        Person personInDatabase = readById(id);
        personInDatabase.setFirstName(newData.getFirstName());
        personInDatabase.setLastName(newData.getLastName());
        personInDatabase.setBirthDate(newData.getBirthDate());
        Person personAfterPersistence = personRepo.save(personInDatabase);
        return personAfterPersistence;
    }

    public Person deleteById(Long id) {
        Person deletedPerson = readById(id);
        personRepo.deleteById(id);
        return deletedPerson;
    }
}
