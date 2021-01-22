package com.github.perscholas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * Created by leon on 8/20/2020.
 */
public class CsvSourceTest {
    public static void main(String[] args) {
        CsvSourceTest test1 = new CsvSourceTest();
        test1.test(1,1,2,true);

        CsvSourceTest test2 = new CsvSourceTest();
        test2.test(1,1,3,false);
    }

    public CsvSourceTest() {
        System.out.println("Hello world");
    }

    // given
    @ParameterizedTest
    @CsvSource({"1,1,2,true", "1,1,3,true", "1,1,3,false"})
    public void test(
        int baseValue,
        int valueToAddToBase,
        int proposedSum,
        boolean expectedVeracity) {

        // when
        int actualSum = baseValue + valueToAddToBase;
        boolean actualVeracity = actualSum == proposedSum;

        // then
        Assertions.assertEquals(expectedVeracity, actualVeracity);
    }
}
