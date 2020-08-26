package com.github.perscholas.services;

import com.github.perscholas.models.Store;
import com.github.perscholas.repositories.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by leon on 8/26/2020.
 */
@Service
public class StoreService {
    private StoreRepository storeRepository;

    @Autowired
    public StoreService(StoreRepository storeRepository) {
        this.storeRepository = storeRepository;
    }

    public Iterable<Store> index() {
        return storeRepository.findAll();
    }
}
