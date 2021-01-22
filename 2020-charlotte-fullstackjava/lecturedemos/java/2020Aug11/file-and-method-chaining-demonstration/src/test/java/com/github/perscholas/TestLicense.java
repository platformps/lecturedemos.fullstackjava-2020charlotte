package com.github.perscholas;

import java.util.Date;

/**
 * Created by leon on 8/11/2020.
 */
public class TestLicense {
    public void testLicenseConstructor() {
        String leon = "leon";

        License license = new LicenseBuilder()
                .setName("Leon")
                .setAddress("Address")
                .setDob(new Date())
                .setIssued(new Date())
                .setExpired(new Date())
                .setLicenseClass('C')
                .setSex('M')
                .setWeight(10)
                .setHeight(99)
                .setRestrict('D')
                .setEndorse("")
                .setDriverLicenseNumber("")
                .setState("")
                .build();

    }
}
