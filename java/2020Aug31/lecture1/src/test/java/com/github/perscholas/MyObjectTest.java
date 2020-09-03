package com.github.perscholas;

import org.junit.Assert;
import org.junit.Test;

public class MyObjectTest {
    @Test
    public void testRun() { // TODO
        // Given
        Runnable myObject = System.out::println;

        // when
        myObject.run();

        //then
        Assert.assertNotNull(myObject.toString());
    }
}
