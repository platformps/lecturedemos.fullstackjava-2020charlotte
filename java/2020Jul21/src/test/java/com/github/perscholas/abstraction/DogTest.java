package com.github.perscholas.abstraction;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 7/21/2020.
 */
public class DogTest {
    @Test
    public void testMakeNoise() {
        // given
        Animal dog = new Dog();
        String expected = "Bark!";

        // when
        String actual = dog.makeNoise();

        // then
        Assert.assertEquals(expected, actual);
    }
}
