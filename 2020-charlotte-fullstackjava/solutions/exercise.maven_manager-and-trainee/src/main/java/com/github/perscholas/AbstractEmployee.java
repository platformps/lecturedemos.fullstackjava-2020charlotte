package com.github.perscholas;

/**
 * Created by leon on 6/10/2020.
 */
abstract public class AbstractEmployee implements EmployeeInterface {
    private Long id;
    private String name;
    private String address;
    private Long phoneNumber;
    private Double basicSalary;
    private Double specialAllowance;
    private Double healthReimbursementAccount;


    public AbstractEmployee(Long id, String name, String address, Long phoneNumber, Double basicSalary, Double specialAllowance, Double healthReimbursementAccount) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.basicSalary = basicSalary;
        this.specialAllowance = specialAllowance;
        this.healthReimbursementAccount = healthReimbursementAccount;
    }

    public AbstractEmployee(Long id, String name, String address, Long phoneNumber, Double basicSalary) {
        this(id, name, address, phoneNumber, basicSalary, 250.80, 1000.50);
    }

    public AbstractEmployee() {
        this.specialAllowance = 250.80;
        this.healthReimbursementAccount = 1000.50;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public Long getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public Double getBasicSalary() {
        return basicSalary;
    }

    @Override
    public void setBasicSalary(Double basicSalary) {
        this.basicSalary = basicSalary;
    }

    @Override
    public Double getSpecialAllowance() {
        return specialAllowance;
    }

    @Override
    public void setSpecialAllowance(Double specialAllowance) {
        this.specialAllowance = specialAllowance;
    }

    @Override
    public Double getHealthReimbursementAccount() {
        return healthReimbursementAccount;
    }

    @Override
    public void setHealthReimbursementAccount(Double healthReimbursementAccount) {
        this.healthReimbursementAccount = healthReimbursementAccount;
    }
}
