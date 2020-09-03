package com.github.perscholas;

import com.github.perscholas.generics.GenericPerson;
import org.junit.Test;

import java.util.Date;

/**
 * Created by leon on 7/22/2020.
 */
public class PersonTest {
    @Test
    public void test() {
        GenericPerson person = new GenericPerson("Leon", "Hunter", 99, new Date());

        person.firstName.setSomeData("New FirstName");
        person.lastName.setSomeData("New LastName");

        String firstName = person.firstName.getSomeData();
        Integer age = person.age.getSomeData();
        Date date = person.birthdate.getSomeData();
    }
}
