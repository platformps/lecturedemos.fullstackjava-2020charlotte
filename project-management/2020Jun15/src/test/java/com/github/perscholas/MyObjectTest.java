package com.github.perscholas;

import org.junit.Assert;
import org.junit.Test;

public class MyObjectTest {
    @Test
    public void testRun() {
        // given
        Person person = new Person();
        String expectedOutput = "Hello World";

        // when
        String output = person.speak();

        // then
        Assert.assertEquals(expectedOutput, output);
    }
}
