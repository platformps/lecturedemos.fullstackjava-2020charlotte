package com.github.perscholas.someotherpackage;

import java.util.Date;

/**
 * Created by leon on 7/20/2020.
 */
public class StaticPublicPool {
    private static int numberOfPeopleInPool;

    public static void addPerson(String name) {
        numberOfPeopleInPool++;
        System.out.println("Someone has been added to the pool!");
        System.out.println("The person's name is " + name);
    }

    public static void addPerson(String name, Date birthdate) {
        numberOfPeopleInPool++;
        System.out.println("Someone has been added to the pool!");
        System.out.println("The person's name is " + name);
        System.out.println("The person's birthdate is " + birthdate);
    }


    public static void removePerson() {
        numberOfPeopleInPool--;
        System.out.println("Someone has been removed from the pool!");
    }


    public static void printNumberOfPeople() {
        System.out.println("There are " + numberOfPeopleInPool + " people in the pool.");
    }
}
