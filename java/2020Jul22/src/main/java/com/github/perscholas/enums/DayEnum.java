package com.github.perscholas.enums;

/**
 * Created by leon on 7/22/2020.
 */
public enum DayEnum {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY;

    private final int dayOfWeek;
    private final String nameOfDay;

    DayEnum() {
        this.dayOfWeek = ordinal();
        this.nameOfDay = name();
    }

    public int getDayOfWeek() {
        return dayOfWeek;
    }

    public String getNameOfDay() {
        return nameOfDay;
    }
}
