package com.github.perscholas.employee;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by leon on 9/15/2020.
 */
@Repository
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {
}
