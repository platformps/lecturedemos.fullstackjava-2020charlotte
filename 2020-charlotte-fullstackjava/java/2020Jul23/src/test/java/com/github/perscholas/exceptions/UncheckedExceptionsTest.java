package com.github.perscholas.exceptions;

import org.junit.Test;

/**
 * Created by leon on 7/23/2020.
 */
public class UncheckedExceptionsTest {

    @Test(expected = NullPointerException.class)
    public void positiveNullPointerExceptionTest() {
        // given
        String string = null;

        // when
        string.replaceAll("", "");
    }


    @Test
    public void negativeNullPointerExceptionTest() {
        // given
        String string = "";

        // when
        string.replaceAll("", "");
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void arrayIndexOutOfBoundsExceptionTest() {
        // given
        Integer[] intArray = {9,8,7,6,5,4,3,2,1};

        // when
        int invalidElement = intArray[-1];
    }
}
