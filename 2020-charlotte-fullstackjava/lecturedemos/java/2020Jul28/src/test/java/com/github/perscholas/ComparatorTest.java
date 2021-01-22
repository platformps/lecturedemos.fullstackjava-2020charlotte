package com.github.perscholas;

import org.junit.Assert;
import org.junit.Test;

import java.util.Comparator;

/**
 * Created by leon on 7/28/2020.
 */
public class ComparatorTest {
    @Test
    public void test() {
        // given
        String firstName = "Leon";
        Person person1 = new Person();
        person1.setFirstName(firstName);

        Person person2 = new Person();
        person2.setFirstName(firstName);

        // when
        boolean isSameInstanceInMemory = person1 == person2;

        // then
        Assert.assertFalse(isSameInstanceInMemory);
    }
}
