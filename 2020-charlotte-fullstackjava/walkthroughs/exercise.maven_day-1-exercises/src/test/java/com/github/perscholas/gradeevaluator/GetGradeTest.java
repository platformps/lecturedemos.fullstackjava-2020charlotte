package com.github.perscholas.gradeevaluator;

import com.github.perscholas.GradeEvaluator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 7/14/2020.
 */
public class GetGradeTest {
    // given
    private void test(Double score, Character expectation) {
        GradeEvaluator gradeEvaluator = new GradeEvaluator();

        // when
        Character actual = gradeEvaluator.getGrade(score);

        // then
        Assert.assertEquals(actual, expectation);
    }

    @Test
    public void testF1() {
        test(0.0, 'F');
    }

    @Test
    public void testF2() {
        test(64.0, 'F');
    }


    @Test
    public void testD1() {
        test(65.0, 'D');
    }

    @Test
    public void testD2() {
        test(69.0, 'D');
    }

    @Test
    public void testC1() {
        test(70.0, 'C');
    }

    @Test
    public void testC2() {
        test(79.0, 'C');
    }

    @Test
    public void testB1() {
        test(80.0, 'B');
    }

    @Test
    public void testB2() {
        test(89.0, 'B');
    }

    @Test
    public void testA1() {
        test(90.0, 'A');
    }

    @Test
    public void testA2() {
        test(100.0, 'A');
    }
}
