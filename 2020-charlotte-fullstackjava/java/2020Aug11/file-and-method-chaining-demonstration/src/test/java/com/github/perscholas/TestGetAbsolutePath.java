package com.github.perscholas;

import com.github.perscholas.lectureutils.FileUtility;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * Created by leon on 8/11/2020.
 */
public class TestGetAbsolutePath {
    private void test(String expected, String path) {
        File file = new File(path);

        // when
        String actual = file.getAbsolutePath();

        // then
        String fileContent = FileUtility.getFileContentAsString(file);
        System.out.println(fileContent);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAbsolutePathOfAbsoluteFile() {
        // given
        String someRelativePath = "C:\\Users\\CTAdmin\\dev\\perscholas\\lecturedemos\\java\\2020Aug10\\README-Sample.md";
        test(someRelativePath, someRelativePath);
    }

    @Test(expected = FileNotFoundException.class)
    public void testAbsolutePathOfRelativeFile() {
        // given
        String expected = "not really sure";
        String someRelativePath = "../../2020Aug11/.gitignore";
        test(expected, someRelativePath);
    }
}
