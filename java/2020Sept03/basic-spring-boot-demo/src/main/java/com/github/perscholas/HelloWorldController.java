package com.github.perscholas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello-world")
public class HelloWorldController {
    private PersonService service;

    @Autowired
    public HelloWorldController(PersonService service) {
        this.service = service;
    }

    @GetMapping
    String getView(Model model) {
        String variableName = "message";
        String variableValue = service.readAll().toString();
        model.addAttribute(variableName, variableValue);
        return "welcome";
    }
}