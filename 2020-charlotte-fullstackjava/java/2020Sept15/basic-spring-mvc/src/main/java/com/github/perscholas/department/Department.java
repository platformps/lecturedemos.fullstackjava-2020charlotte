package com.github.perscholas.department;

import com.github.perscholas.employee.Employee;

import javax.persistence.*;
import java.util.List;

/**
 * Created by leon on 9/15/2020.
 */
@Entity
public class Department {
    @Id
    @GeneratedValue
    private Long id;

    private String departmentName;

    @OneToMany
    @ElementCollection
    private List<Employee> employees;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
