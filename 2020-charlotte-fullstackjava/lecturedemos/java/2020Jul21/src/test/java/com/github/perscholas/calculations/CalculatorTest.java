package com.github.perscholas.calculations;

import com.github.perscholas.calculations.Calculator;
import com.github.perscholas.calculations.Multiplier;
import org.junit.Test;

import java.util.*;

/**
 * Created by leon on 7/21/2020.
 */
public class CalculatorTest {
    @Test
    public void addTest() {
        // given
        Calculator calculator = new Multiplier();

        // when
        calculator.add(10, 15);

        // then
        // TODO - fetch output from out-stream
    }


    @Test
    public void subtractTest() {
        // given
        Calculator calculator = new Multiplier();

        // when
        calculator.subtract(10, 15);

        // then
        // TODO - fetch output from out-stream
    }
}
