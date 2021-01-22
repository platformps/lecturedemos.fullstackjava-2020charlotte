package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by leon on 8/25/2020.
 */
@RestController
@RequestMapping(value = "/my-controller")
public class MyController {
    @GetMapping(value = "/")
    public String index() {
        return "<h1>Hello World!</h1>";
    }
}