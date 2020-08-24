package com.github.perscholas.dao;

import com.github.perscholas.model.User;

/**
 * Created by leon on 8/19/2020.
 */
public class UserJpaRepository extends AbstractJpaRepository<String, User> {
    public UserJpaRepository(String persistenceUnitName) {
        super(persistenceUnitName);
    }

    @Override
    public Class<User> getEntityClass() {
        return User.class;
    }

    @Override
    public User update(User existingEntity, User newData) {
        existingEntity.setAddress(newData.getAddress());
        existingEntity.setName(newData.getName());
        existingEntity.setPassword(newData.getPassword());
        existingEntity.setState(newData.getState());
        existingEntity.setZip(newData.getZip());
        return existingEntity;
    }
}
