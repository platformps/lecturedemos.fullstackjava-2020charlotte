package com.github.perscholas;

import org.junit.Test;

import java.util.Date;

/**
 * Created by leon on 7/28/2020.
 */
public class ComparableTest {
    @Test
    public void poorGenerification() {
        Comparable comparableInt = 5;
        comparableInt.compareTo(new Date()); // this expression is nonsense and we've allowed it
    }

    @Test
    public void properGenerification() {
        Comparable<Integer> comparableInt = 5;
        comparableInt.compareTo(10);
    }
}
