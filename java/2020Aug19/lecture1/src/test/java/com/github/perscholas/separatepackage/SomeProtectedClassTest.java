package com.github.perscholas.separatepackage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

/**
 * Created by leon on 8/19/2020.
 */
public class SomeProtectedClassTest {
    public void test() {
        try {
            Method privateMethod = SomeProtectedClass.class.getDeclaredMethod("method");
            Assertions.assertFalse(privateMethod.isAccessible());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
