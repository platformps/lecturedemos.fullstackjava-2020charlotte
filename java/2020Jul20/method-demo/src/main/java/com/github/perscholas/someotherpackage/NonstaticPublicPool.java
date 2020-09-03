package com.github.perscholas.someotherpackage;

/**
 * Created by leon on 7/20/2020.
 */
public class NonstaticPublicPool {
    private int numberOfPeopleInPool;

    public void addPerson(String name) {
        numberOfPeopleInPool++;
        System.out.println("Someone has been added to the pool!");
        System.out.println("The person's name is " + name);
    }

    public void removePerson() {
        numberOfPeopleInPool--;
        System.out.println("Someone has been removed from the pool!");
    }

    public void printNumberOfPeople() {
        System.out.println("There are " + numberOfPeopleInPool + " people in the pool.");
    }
}
