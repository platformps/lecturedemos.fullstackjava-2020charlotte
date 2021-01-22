package com.github.perscholas.employee;

/**
 * Created by leon on 9/15/2020.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    private EmployeeRepository repository;

    @Autowired
    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public Employee create(Employee employeeToBeCreated) {
        Employee persistedEmployee = repository.save(employeeToBeCreated);
        return persistedEmployee;
    }

    public List<Employee> readAll() {
        Iterable<Employee> employeeIterable = repository.findAll();
        List<Employee> employeeList = new ArrayList<>();
        employeeIterable.forEach(employeeList::add);
        return employeeList;
    }

    public Employee readById(Long id) {
        return repository.findById(id).get();
    }

    public Employee updateById(Long id, Employee updatedData) {
        Employee employeeInDb = readById(id);
        employeeInDb.setDepartment(updatedData.getDepartment());
        employeeInDb.setFirstName(updatedData.getFirstName());
        employeeInDb.setLastName(updatedData.getLastName());
        employeeInDb.setStartDate(updatedData.getStartDate());
        employeeInDb = repository.save(employeeInDb);
        return employeeInDb;
    }

    public Employee deleteById(Long id) {
        Employee employeeToBeDeleted = readById(id);
        repository.delete(employeeToBeDeleted);
        return employeeToBeDeleted;
    }

    public Employee updateFirstName(Long id, String firstName) {
        Employee employeeInDatabase = readById(id);
        employeeInDatabase.setFirstName(firstName);
        return updateById(id, employeeInDatabase);
    }
}
