package com.github.perscholas;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello-world")
public class HelloWorldController {


    @GetMapping
    String getView(Model model) {
        String valueToInject = "This is is an injected message";
        String nameOfVariable = "msg";
        String jspName = "home-page-component/homepage";

        model.addAttribute(nameOfVariable,valueToInject);
        return jspName;
    }
}