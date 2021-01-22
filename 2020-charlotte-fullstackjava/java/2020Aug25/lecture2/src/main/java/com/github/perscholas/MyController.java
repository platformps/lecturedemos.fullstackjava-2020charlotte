package com.github.perscholas;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/my-controller")
public class MyController {
    @GetMapping("/")
    public String index() {
        return "<h1>Hello World!</h1>";
    }
}
