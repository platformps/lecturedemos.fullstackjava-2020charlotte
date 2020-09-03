package com.github.perscholas;

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
    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/read/all")
    public ResponseEntity<List<Person>> readAll() {
        return new ResponseEntity<>(personService.readAll(), HttpStatus.OK);
    }

    @GetMapping("/read/{id}")
    public ResponseEntity<Person> readById(@PathVariable Long id) {
        return new ResponseEntity<>(personService.readById(id), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Person> create(@RequestBody Person person) {
        return new ResponseEntity<>(personService.create(person), HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Person> update(@PathVariable Long id, @RequestBody Person newData) {
        return new ResponseEntity<>(personService.update(id, newData), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Person> delete(@PathVariable Long id) {
        return new ResponseEntity<>(personService.deleteById(id), HttpStatus.OK);
    }
}
