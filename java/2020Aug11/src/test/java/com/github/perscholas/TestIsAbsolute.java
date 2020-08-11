package com.github.perscholas;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;

/**
 * Created by leon on 8/11/2020.
 */
public class TestIsAbsolute {
    private void test(String filePath, boolean expected) {
        File file = new File(filePath);

        // when
        boolean actual = file.isAbsolute();

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIsAbsoluteTrue() {
        // given
        String someAbsolutePath = "C:/temp";
        // when
        test(someAbsolutePath, true);
    }

    @Test
    public void testIsAbsoluteFalse() {
        // given
        String someRelativePath = "..";
        test(someRelativePath, false);
    }
}
