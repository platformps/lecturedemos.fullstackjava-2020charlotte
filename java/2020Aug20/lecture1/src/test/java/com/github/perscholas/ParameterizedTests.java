package com.github.perscholas;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * Created by leon on 8/20/2020.
 */
public class ParameterizedTests {
    @ParameterizedTest
    @ValueSource(strings = {"red", "green", "blue"})
    void test(String color) {
        System.out.println(color);
    }
}
