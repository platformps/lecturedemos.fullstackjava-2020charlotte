package com.github.perscholas.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.Arrays;

/**
 * Created by leon on 9/3/2020.
 */
@Configuration
public class ProductConfig {
    @Autowired
    private ProductRepository repository;

    @PostConstruct
    public void setup() {
        repository.saveAll(Arrays.asList(
                new Product(),
                new Product(),
                new Product()));
    }
}
