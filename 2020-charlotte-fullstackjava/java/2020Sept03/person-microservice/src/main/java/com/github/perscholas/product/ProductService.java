package com.github.perscholas.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leon on 9/3/2020.
 */
@Service
public class ProductService {
    private ProductRepository repository;

    @Autowired
    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public Product create(Product product) {
        return repository.save(product);
    }

    public Product readById(Long id) {
        return repository.findById(id).get();
    }

    public List<Product> readAll() {
        Iterable<Product> productIterable = repository.findAll();
        List<Product> productList = new ArrayList<>();
        productIterable.forEach(productList::add);
        return productList;
    }

    public Product update(Long id, Product newData) {
        Product productInDatabase = readById(id);
        productInDatabase.setDescription(newData.getDescription());
        productInDatabase.setProductName(newData.getProductName());
        repository.save(productInDatabase);
        return productInDatabase;
    }

    public Product delete(Long id) {
        Product productInDatabase = readById(id);
        repository.delete(productInDatabase);
        return productInDatabase;
    }
}
