package com.github.perscholas;

import org.junit.Test;

import java.util.Date;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by leon on 8/11/2020.
 */
public class TestBuilderPattern {
    @Test
    public void testLicenseBuilderExpanded() {
        LicenseBuilder licenseBuilder = new LicenseBuilder();
        licenseBuilder.setAddress("");
        licenseBuilder.setDob(new Date());
        License license = licenseBuilder.build();
    }

    @Test
    public void testLicenseBuilderSimplified() {
        License license = new LicenseBuilder()
                .setName("Chris")
                .setLicenseClass('C')
                .setDriverLicenseNumber("100")
                .setDob(new Date())
                .setExpired(new Date())
                .setIssued(new Date())
                .build();
    }
    @Test
    public void testStream() {
        Stream
                .of() // append initial values
                .filter(null) // append procedure for filtering
                .filter(null) // append procedure for more filtering
                .map(null) // append procedure for mapping
                .flatMapToInt(null) // append procedure for mapping
                .map(null) // append procedure for mapping
                .mapToObj(i -> "" + i) // append procedure for mapping
                .collect(Collectors.toList()); // invoke procedure

    }

    @Test
    public void testStringBuilder() {
        String output = new StringBuilder()
                .append("First value to be added")
                .append("Second value to be added")
                .append("Third value to be added")
                .append("Fourth value to be added")
                .toString();
    }
}
