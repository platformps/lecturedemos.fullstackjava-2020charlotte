package com.github.perscholas;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by leon on 8/3/2020.
 */
public class CollectorsTest {
    @Test
    public void test() {
        Integer[] list = Arrays
                .asList(1,2,40,10321)
                .stream()
                .toArray(Integer[]::new);
    }
}
