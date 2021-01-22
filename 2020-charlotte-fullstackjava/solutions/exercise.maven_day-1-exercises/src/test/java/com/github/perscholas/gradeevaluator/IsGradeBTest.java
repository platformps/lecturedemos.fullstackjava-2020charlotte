package com.github.perscholas.gradeevaluator;

import com.github.perscholas.GradeEvaluator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 7/14/2020.
 */
public class IsGradeBTest {
    // given
    private void test(Double value, Boolean expectation) {
        GradeEvaluator gradeEvaluator = new GradeEvaluator();

        // when
        Boolean actual = gradeEvaluator.isGradeB(value);

        // then
        Assert.assertEquals(actual, expectation);
    }


    @Test
    public void test1() {
        test(89.0, true);
    }

    @Test
    public void test2() {
        test(80.0, true);
    }

    @Test
    public void test3() {
        test(85.0, true);
    }

    @Test
    public void test4() {
        test(0.0, false);
    }

    @Test
    public void test5() {
        test(75.0, false);
    }

}
