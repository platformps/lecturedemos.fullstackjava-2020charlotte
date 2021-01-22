package com.github.perscholas.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.Arrays;

/**
 * Created by leon on 9/15/2020.
 */
@Configuration
public class EmployeeConfig {
    @Autowired
    private EmployeeRepository repository;

    @PostConstruct
    public void setup() {
        repository.saveAll(Arrays.asList(
                new Employee(),
                new Employee(),
                new Employee(),
                new Employee()));
    }
}
