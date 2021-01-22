package com.github.perscholas.objectrelations;

import org.junit.Assert;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by leon on 8/6/2020.
 */
public class PersonTest {
    @Test
    public void test() throws ParseException {
        // given
        String sDate1 = "31/12/1001";
        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
        Person person = new Person(null, null);

        // when
        person.birthDate = date1;

        // then
        Assert.assertEquals(person.birthDate, date1);
    }
}
