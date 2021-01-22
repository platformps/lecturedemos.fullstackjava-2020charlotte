package com.github.perscholas;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by leon on 8/19/2020.
 */
public class BeforeBeforeAllAnnotationTest {
     @BeforeAll
    public static void before() {
        System.out.println("1. The before method is being invoked");
    }

    public BeforeBeforeAllAnnotationTest() {
        System.out.println("2. The test has been instantiated");
    }

    @BeforeEach
    public void setup() {
        System.out.println("3. The setup has been invoked");
    }

    @Test
    public void testRun1() {
        System.out.println("4A. The test is running");
    }

    @Test
    public void testRun2() {
        System.out.println("4B. The test is running");
    }

    @AfterEach
    public void finish() {
        System.out.println("5. The finish method has been invoked");
    }
}
