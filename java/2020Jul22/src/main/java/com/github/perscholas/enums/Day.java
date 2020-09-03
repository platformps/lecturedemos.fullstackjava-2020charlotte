package com.github.perscholas.enums;

public class Day {
    public static final Day MONDAY = new Day(1, "Monday");
    public static final Day TUESDAY = new Day(2, "Tuesday");
    public static final Day WEDNESDAY = new Day(3, "Wednesday");
    public static final Day THURSDAY = new Day(4, "Thursday");
    public static final Day FRIDAY = new Day(5, "Friday");

    private final int dayOfWeek;
    private final String nameOfDay;

    public Day(int dayOfWeek, String nameOfDay) {
        this.dayOfWeek = dayOfWeek;
        this.nameOfDay = nameOfDay;
    }

    public int getDayOfWeek() {
        return dayOfWeek;
    }

    public String getNameOfDay() {
        return nameOfDay;
    }
}
