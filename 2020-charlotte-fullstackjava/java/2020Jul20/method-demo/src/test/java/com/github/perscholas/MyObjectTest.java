package com.github.perscholas;

import org.junit.Assert;
import org.junit.Test;

public class MyObjectTest {
    @Test
    public void testRun() { // TODO
        // Given
        Person myObject = new Person();

        // when

        //then
        Assert.assertNotNull(myObject.toString());
    }
}
