package com.github.perscholas;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private Integer userInputAge;
    private String userInputName;
    private List<Pet> pets = new ArrayList<>();

    public Person() {
        Pet animal1 = new Pet();
        Pet animal2 = new Pet();
        pets.add(animal1);
        pets.add(animal2);
    }

    public Person(String userInputName, Integer userInputAge) {
        this.userInputName = userInputName;
        this.userInputAge = userInputAge;
    }

    public void addPet(Pet animal) {
        pets.add(animal);
    }

    public void printAnimalList() {
        System.out.println(pets);
    }

    public List<Pet> getPets() {
        return this.pets;
    }

    public Integer getUserInputAge() {
        return userInputAge;
    }

    public void setUserInputAge(Integer userInputAge) {
        this.userInputAge = userInputAge;
    }

    public String getUserInputName() {
        return userInputName;
    }

    public void setUserInputName(String userInputName) {
        this.userInputName = userInputName;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    public String toString() {
        return "Name = " + userInputName + "\n" + "Age = " + userInputAge;
    }
}