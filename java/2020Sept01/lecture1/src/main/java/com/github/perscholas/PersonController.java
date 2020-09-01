package com.github.perscholas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leon on 9/1/2020.
 */
@Controller
@RequestMapping("/person-controller")
public class PersonController {
    private PersonService service;

    @Autowired
    public PersonController(PersonService service) {
        this.service = service;
    }


    @RequestMapping(value = "/")
    public ResponseEntity<List<Person>> getAll() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }


}
