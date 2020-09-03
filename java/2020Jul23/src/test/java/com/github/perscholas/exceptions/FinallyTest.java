package com.github.perscholas.exceptions;

import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by leon on 7/23/2020.
 */
public class FinallyTest {
    @Test
    public void test() {
        try {
            System.out.println("Hello world");
        } finally {
            System.out.println("Hello world!");
        }
    }
}
