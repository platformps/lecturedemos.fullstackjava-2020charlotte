package com.github.perscholas;

import org.junit.Test;

import java.util.Comparator;

/**
 * Created by leon on 7/28/2020.
 */
public class PersonComparatorTest {
    @Test
    public void test() {
        Comparator<Person> personComparator = new PersonComparator();
        Comparator<Person> lambdaPersonComparator = (Person arg1,Person arg2) -> {
            return 0;
        };
    }
}
