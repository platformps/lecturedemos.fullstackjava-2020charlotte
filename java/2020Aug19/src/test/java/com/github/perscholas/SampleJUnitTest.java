package com.github.perscholas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Created by leon on 8/19/2020.
 */
public class SampleJUnitTest {

    @Test
    public void testSetName() {
        // given
        String expectedBabyName = "Leon";
        Person person = new Person(); // baby is born
        Assertions.assertNull(person.getFirstName());

        // when
        person.setFirstName(expectedBabyName);
        String nameThatTheBabyRespondsTo = person.getFirstName();

        // then
        Assertions.assertEquals(expectedBabyName, nameThatTheBabyRespondsTo);
    }
}
