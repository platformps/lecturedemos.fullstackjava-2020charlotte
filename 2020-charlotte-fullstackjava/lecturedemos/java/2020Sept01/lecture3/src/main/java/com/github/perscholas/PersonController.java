package com.github.perscholas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by leon on 9/1/2020.
 */
@RequestMapping("/person-controller")
public class PersonController {
    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public String getView(Model model) {
        model.addAttribute("message", "Hello there, This message has been injected from the controller method");
        return "index";
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


    // GET verb is used to fetch data from server
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Person> readById(@PathVariable Long id) {
        return new ResponseEntity<>(personService.readById(id), HttpStatus.OK);
    }


    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Person> delete(@PathVariable Long id) {
        return new ResponseEntity<>(personService.deleteById(id), HttpStatus.OK);
    }

    @RequestMapping(value = "update/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Person> update(@PathVariable Long id, @RequestBody Person newPersonData) {
        return new ResponseEntity<>(personService.updateById(id, newPersonData), HttpStatus.OK);
    }

}
