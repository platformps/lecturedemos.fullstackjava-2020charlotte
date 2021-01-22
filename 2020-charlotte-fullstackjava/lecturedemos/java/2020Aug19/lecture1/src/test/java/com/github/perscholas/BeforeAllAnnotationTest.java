package com.github.perscholas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class BeforeAllAnnotationTest {
    @BeforeAll
    public static void before() {
        System.out.println("The before method is being invoked");
    }

    public BeforeAllAnnotationTest() {
        System.out.println("The test has been instantiated");
    }

    @Test
    public void testRun() { // TODO
        System.out.println("The test is running");
    }
}
