package com.github.perscholas;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by leon on 9/3/2020.
 */
@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {
}
