package com.github.perscholas.staticmembers;

import com.github.perscholas.enums.Person;
import org.junit.Test;

/**
 * Created by leon on 7/22/2020.
 */
public class PersonTest {
    @Test
    public void testAutoGenerateId() {
        // given
        Person[] people = new Person[]{
                new Person(),
                new Person(),
                new Person()
        };

        // when
        for (int i = 0; i < people.length; i++) {
            Person person = people[i];
            Long personId = person.getId();
            System.out.println(personId);
        }


        // then
    }
}
