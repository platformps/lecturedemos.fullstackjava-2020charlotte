package com.github.perscholas;

import java.util.Date;

/**
 * Created by leon on 8/11/2020.
 */
public class License {
    private String name;
    private String address;
    private Date dob;
    private Date issued;
    private Date expired;
    private Character licenseClass;
    private Character sex;
    private Integer weight;
    private Integer height;
    private Character restrict;
    private String endorse;
    private String driverLicenseNumber;
    private String state;

    public License(String name, String address, Date dob, Date issued, Date expired, Character licenseClass, Character sex, Integer weight, Integer height, Character restrict, String endorse, String driverLicenseNumber, String state) {
        this.name = name;
        this.address = address;
        this.dob = dob;
        this.issued = issued;
        this.expired = expired;
        this.licenseClass = licenseClass;
        this.sex = sex;
        this.weight = weight;
        this.height = height;
        this.restrict = restrict;
        this.endorse = endorse;
        this.driverLicenseNumber = driverLicenseNumber;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Date getIssued() {
        return issued;
    }

    public void setIssued(Date issued) {
        this.issued = issued;
    }

    public Date getExpired() {
        return expired;
    }

    public void setExpired(Date expired) {
        this.expired = expired;
    }

    public Character getLicenseClass() {
        return licenseClass;
    }

    public void setLicenseClass(Character licenseClass) {
        this.licenseClass = licenseClass;
    }

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Character getRestrict() {
        return restrict;
    }

    public void setRestrict(Character restrict) {
        this.restrict = restrict;
    }

    public String getEndorse() {
        return endorse;
    }

    public void setEndorse(String endorse) {
        this.endorse = endorse;
    }

    public String getDriverLicenseNumber() {
        return driverLicenseNumber;
    }

    public void setDriverLicenseNumber(String driverLicenseNumber) {
        this.driverLicenseNumber = driverLicenseNumber;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
