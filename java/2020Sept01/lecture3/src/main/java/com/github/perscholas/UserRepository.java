package com.github.perscholas;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by leon on 9/1/2020.
 */
public interface UserRepository extends CrudRepository<User, Long> {
}
