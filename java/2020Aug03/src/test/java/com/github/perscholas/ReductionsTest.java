package com.github.perscholas;

import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by leon on 8/3/2020.
 */
public class ReductionsTest {
    @Test
    public void test() {
        System.out.println(sum(5,10,15,20));
    }

    public Integer sum(Integer... numbers) {
        Integer sum = Stream.of(numbers).reduce(10, Integer::sum);
        return sum;
    }
}
