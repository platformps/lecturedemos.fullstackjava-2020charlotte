package com.github.perscholas.abstraction;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 7/21/2020.
 */
public class NoiseMakerTest {
    // given
    private void test(NoiseMaker noiseMaker, String expected) {
        // when
        String actual = noiseMaker.makeNoise();

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dogMakeNoiseTest() {
        // given
        NoiseMaker dog = new Dog();
        String expected = "Bark!";
        test(dog, expected);
    }

    @Test
    public void carMakeNoiseTest() {
        // given
        NoiseMaker car = new Car();
        String expected = "Vroom!";
        test(car, expected);
    }
}
