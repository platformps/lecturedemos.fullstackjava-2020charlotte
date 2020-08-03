package com.github.perscholas;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by leon on 8/3/2020.
 */
public class SimpleReductionsTest {
    private final String[] stringArray = "the quick brown fox jumps over the lazy dog".split(" ");

    @Test
    public void testCount() {
        Stream<String> stream = Arrays.stream(stringArray);
        long count = stream.count();
        System.out.println(count);
    }

    @Test
    public void testMin() {
        Stream<String> stream = Arrays.stream(stringArray);
        String minString = stream
                .min(Comparator.naturalOrder())
                .get();
        System.out.println(minString);
    }


    @Test
    public void testMax() {
        Stream<String> stream = Arrays.stream(stringArray);
        String maxString = stream
                .max(Comparator.naturalOrder())
                .get();
        System.out.println(maxString);
    }

    @Test
    public void findFirst() {

    }
}
