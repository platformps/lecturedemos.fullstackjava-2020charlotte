package com.github.perscholas.enums;

import com.github.perscholas.IOConsole;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 7/22/2020.
 */
public class DayEnumTest {
    @Test
    public void testMonday() {
        // given
        DayEnum monday = DayEnum.MONDAY;
        int expectedDayOfWeek = 1;
        String expectedNameOfDay = "Monday";
        IOConsole ioConsole = new IOConsole();
        String input = ioConsole.getStringInput("What day were you born on?");
        DayEnum enumeration = DayEnum.valueOf(input.toUpperCase());

        // when
        int actualDayOfWeek = monday.getDayOfWeek();
        String actualNameOfDay = monday.getNameOfDay();

        // then
        Assert.assertEquals(expectedDayOfWeek, actualDayOfWeek);
        Assert.assertEquals(expectedNameOfDay, actualNameOfDay);
    }

    @Test
    public void testGetDayOfWeekFromInput() {
        // given
        IOConsole ioConsole = new IOConsole();
        String input = ioConsole.getStringInput("What day were you born on?");
        DayEnum enumeration = DayEnum.valueOf(input.toUpperCase());

        // when
        int actualDayOfWeek = enumeration.getDayOfWeek();
        String actualNameOfDay = enumeration.getNameOfDay();

        // then
        ioConsole.println("You were born on %s", actualNameOfDay);
        ioConsole.println("%s is the %s day of the week", actualNameOfDay, actualDayOfWeek);
    }
}
