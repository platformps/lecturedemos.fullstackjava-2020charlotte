package com.github.perscholas.enums;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 7/22/2020.
 */
public class DayTest {
    @Test
    public void testMonday() {
        // given
        Day monday = Day.MONDAY;
        int expectedDayOfWeek = 1;
        String expectedNameOfDay = "Monday";

        // when
        int actualDayOfWeek = monday.getDayOfWeek();
        String actualNameOfDay = monday.getNameOfDay();

        // then
        Assert.assertEquals(expectedDayOfWeek, actualDayOfWeek);
        Assert.assertEquals(expectedNameOfDay, actualNameOfDay);
    }
}
