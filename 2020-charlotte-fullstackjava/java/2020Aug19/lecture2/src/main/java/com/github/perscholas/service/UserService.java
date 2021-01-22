package com.github.perscholas.service;

import com.github.perscholas.dao.UserJpaRepository;
import com.github.perscholas.model.User;

import java.util.List;

/**
 * Created by leon on 8/19/2020.
 */
public class UserService extends AbstractService<String, User, UserJpaRepository> {
    public UserService(UserJpaRepository repository) {
        super(repository);
    }

    public Boolean validateLogin(String userName, String password) {
        List<User> listOfMatchingUsers =  getRepository().findAllWhere(user ->
                user.getName().equals(userName) &&
                user.getPassword().equals(password));
        Boolean isValidLoginInfo = listOfMatchingUsers.size() == 1;
        return isValidLoginInfo;
    }
}
