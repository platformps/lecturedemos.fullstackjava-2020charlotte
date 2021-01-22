package com.github.perscholas.repository;

import com.github.perscholas.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by leon on 8/27/2020.
 */
@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {
}
