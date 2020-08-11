package com.github.perscholas;

import java.util.Date;

public class LicenseBuilder {
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

    public LicenseBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public LicenseBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public LicenseBuilder setDob(Date dob) {
        this.dob = dob;
        return this;
    }

    public LicenseBuilder setIssued(Date issued) {
        this.issued = issued;
        return this;
    }

    public LicenseBuilder setExpired(Date expired) {
        this.expired = expired;
        return this;
    }

    public LicenseBuilder setLicenseClass(Character licenseClass) {
        this.licenseClass = licenseClass;
        return this;
    }

    public LicenseBuilder setSex(Character sex) {
        this.sex = sex;
        return this;
    }

    public LicenseBuilder setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    public LicenseBuilder setHeight(Integer height) {
        this.height = height;
        return this;
    }

    public LicenseBuilder setRestrict(Character restrict) {
        this.restrict = restrict;
        return this;
    }

    public LicenseBuilder setEndorse(String endorse) {
        this.endorse = endorse;
        return this;
    }

    public LicenseBuilder setDriverLicenseNumber(String driverLicenseNumber) {
        this.driverLicenseNumber = driverLicenseNumber;
        return this;
    }

    public LicenseBuilder setState(String state) {
        this.state = state;
        return this;
    }

    public License build() {
        return new License(name, address, dob, issued, expired, licenseClass, sex, weight, height, restrict, endorse, driverLicenseNumber, state);
    }
}