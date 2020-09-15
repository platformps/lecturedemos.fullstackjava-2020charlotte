package com.github.perscholas.department;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by leon on 9/15/2020.
 */
@Repository
public interface DepartmentRepository extends CrudRepository<Department, Long> {
}
