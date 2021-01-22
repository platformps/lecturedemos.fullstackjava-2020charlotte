package com.github.perscholas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by leon on 9/1/2020.
 */
@Controller
@RequestMapping("/person-controller")
public class PersonController {
    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    // POST verb is used to add data to server
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity<Person> create(@RequestBody Person person) {
        return new ResponseEntity<>(personService.create(person), HttpStatus.CREATED);
    }

    // GET verb is used to fetch data from server
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public ResponseEntity<List<Person>> readAll() {
        return new ResponseEntity<>(personService.readAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Person> delete(@PathVariable Long id) {
        return new ResponseEntity<>(personService.deleteById(id), HttpStatus.OK);
    }

    @RequestMapping(value="update/{id}", method=RequestMethod.PUT)
    public ResponseEntity<Person> update(@PathVariable Long id, @RequestBody Person newPersonData) {
        return new ResponseEntity<>(personService.updateById(id, newPersonData), HttpStatus.OK);
    }

}
