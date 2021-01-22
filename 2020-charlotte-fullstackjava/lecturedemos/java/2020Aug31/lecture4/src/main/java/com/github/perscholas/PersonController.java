package com.github.perscholas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by leon on 8/31/2020.
 */
@Controller
@RequestMapping("/person-controller")
public class PersonController {
    private PersonService service;

    @Autowired
    public PersonController(PersonService service) {
        this.service = service;
    }

    @GetMapping("/")
    public ResponseEntity<List<Person>> getAll() {
        return new ResponseEntity(service.getAll(), HttpStatus.OK);
    }


    @GetMapping("/view")
    public String getView(Model model) {
        List<Person> personList = service.getAll();
        StringBuilder injectionValueBuilder = new StringBuilder();
        for (Person person : personList) {
            injectionValueBuilder
                    .append("<ul>")
                    .append(person.toJson())
                    .append("</ul>");
        }
        String valueToInject = injectionValueBuilder.toString();
        String nameOfVariable = "msg";
        String jspName = "index";
        model.addAttribute(nameOfVariable, valueToInject);
        return jspName;
    }
}
