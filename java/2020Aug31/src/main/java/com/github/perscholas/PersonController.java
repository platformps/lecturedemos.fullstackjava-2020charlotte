package com.github.perscholas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by leon on 8/31/2020.
 */
@Controller
@RequestMapping("/person-controller")
public class PersonController {
    @Autowired
    private PersonService service;

    @GetMapping(value = "/all")
    public String viewAll(Model model) {
        return service.viewAll(model);
    }
}
