package com.github.perscholas.gradeevaluator;

import com.github.perscholas.GradeEvaluator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 7/14/2020.
 */
public class IsGradeDTest {
    // given
    private void test(Double value, Boolean expectation) {
        GradeEvaluator gradeEvaluator = new GradeEvaluator();

        // when
        Boolean actual = gradeEvaluator.isGradeD(value);

        // then
        Assert.assertEquals(actual, expectation);
    }


    @Test
    public void test1() {
        test(69.0, true);
    }

    @Test
    public void test2() {
        test(65.0, true);
    }

    @Test
    public void test3() {
        test(66.0, true);
    }

    @Test
    public void test4() {
        test(64.0, false);
    }

    @Test
    public void test5() {
        test(55.0, false);
    }

}
