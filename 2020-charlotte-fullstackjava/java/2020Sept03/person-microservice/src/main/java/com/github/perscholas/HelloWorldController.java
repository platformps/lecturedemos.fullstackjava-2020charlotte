package com.github.perscholas;

import com.github.perscholas.person.Person;
import com.github.perscholas.person.PersonService;
import com.github.perscholas.product.Product;
import com.github.perscholas.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/hello-world")
public class HelloWorldController {
    @Autowired
    private PersonService personService;

    @Autowired
    private ProductService productService;

    @GetMapping
    String getView(Model model) {
        String attributeName = "message";
        List<Product> productList = productService.readAll();
        List<Person> personList = personService.readAll();
        String productListAsString = productList.toString();
        String personListAsString = personList.toString();
        String attributeValue = productListAsString + "<br /><br />" + personListAsString;
        model.addAttribute(attributeName, attributeValue);
        return "welcome";
    }
}