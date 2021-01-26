package com.github.perscholas;

/**
 * Created by leon on 6/10/2020.
 */
public class Manager extends AbstractEmployee {
//    Double expectedSpecialAllowance = 250.80;
//    Double expectedHra = 1000.50;
    // TODO - Ensure that each of the arguments passed through the constructor are assigned to a respective instance variable
    public Manager(Long id, String name, String address, Long phoneNumber, Double basicSalary) {
        super(id, name, address, phoneNumber, basicSalary, 250.80, 1000.50);
    }

    // TODO - Modify to ensure the respective test case passes
    public Manager() {
        super(null, null, null, null, null, 250.80, 1000.50);
    }

    public void calculateSalary() {

    }
}
