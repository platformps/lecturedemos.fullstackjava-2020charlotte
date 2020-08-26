package com.github.perscholas.controllers;

import com.github.perscholas.models.MyModel;
import com.github.perscholas.models.Store;
import com.github.perscholas.services.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by leon on 8/26/2020.
 */
@Controller
public class StoreController {
    private StoreService storeService;

    @Autowired
    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }


    @GetMapping("/")
    public ResponseEntity<Iterable<Store>> index() {
        return new ResponseEntity<>(storeService.index(), HttpStatus.OK);
    }
}
