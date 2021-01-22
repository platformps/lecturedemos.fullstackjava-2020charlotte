package com.github.perscholas.controllers;

import com.github.perscholas.service.UserService;
import com.github.perscholas.utils.IOConsole;

/**
 * Created by leon on 8/19/2020.
 */
public class UserController extends AbstractController<UserService> {
    public UserController(UserService service) {
        super(service);
    }

    @Override
    public void displayById() {

    }

    @Override
    public void displayAll() {
        new IOConsole().println(getService()
                .findAll()
                .toString()
                .replaceAll(", ", "\n")
                .replaceAll("Person\\{", "\n\nPerson\\{"));
    }

    @Override
    public void delete() {

    }

    @Override
    public void update() {

    }

    @Override
    public void create() {

    }
}
