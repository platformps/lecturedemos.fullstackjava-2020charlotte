package com.github.perscholas.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by leon on 9/3/2020.
 */
@Controller
@RequestMapping("/person-controller")
public class PersonController {
    private PersonService service;

    @Autowired
    public PersonController(PersonService service) {
        this.service = service;
    }

    @PostMapping("/create")
    public ResponseEntity<Person> create(@RequestBody Person person) {
        return new ResponseEntity<>(service.create(person), HttpStatus.CREATED);
    }

    @GetMapping("/read/all")
    public ResponseEntity<List<Person>> readAll() {
        return new ResponseEntity<>(service.readAll(), HttpStatus.OK);
    }

    @GetMapping("/read/{id}")
    public ResponseEntity<Person> readById(@PathVariable Long id) {
        return new ResponseEntity<>(service.readById(id), HttpStatus.OK);
    }

    @GetMapping("/read/{firstName}/{lastName}")
    public ResponseEntity<Person> readByFirstNameAndLastName(
            @PathVariable String firstName,
            @PathVariable String lastName) {
        return new ResponseEntity<>(service
                .readAll()
                .stream()
                .filter(person -> person.getFirstName().equals(firstName) && person.getLastName().equals(lastName))
                .findFirst()
                .get(),
                HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Person> update(@PathVariable Long id, @RequestBody Person newData) {
        return new ResponseEntity<>(service.update(id, newData), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Person> delete(@PathVariable Long id) {
        return new ResponseEntity<>(service.delete(id), HttpStatus.OK);
    }
}
