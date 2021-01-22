package com.github.perscholas;

import org.junit.jupiter.api.Test;

/**
 * Created by leon on 8/20/2020.
 */
public class TemplateMethodTests {
    private void test(String color) {
        System.out.println(color);
    }

    @Test
    public void test1() {
        test("red");
    }

    @Test
    public void test2() {
        test("green");
    }

    @Test
    public void test3() {
        test("blue");
    }
}
