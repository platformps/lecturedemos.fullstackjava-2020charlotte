package com.github.perscholas;

public interface EmployeeInterface {
    Long getId();
    String getName();
    String getAddress();
    Long getPhoneNumber();
    Double getBasicSalary();
    Double getSpecialAllowance();
    Double getHealthReimbursementAccount();
    void setId(Long id);
    void setName(String name);
    void setAddress(String address);
    void setPhoneNumber(Long phoneNumber);
    void setBasicSalary(Double basicSalary);
    void setSpecialAllowance(Double specialAllowance);
    void setHealthReimbursementAccount(Double healthReimbursementAccount);
    void calculateSalary();
}
