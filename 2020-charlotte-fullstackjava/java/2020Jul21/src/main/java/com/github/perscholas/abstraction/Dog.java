package com.github.perscholas.abstraction;

/**
 * Created by leon on 7/21/2020.
 */
public class Dog extends Animal {
    public Dog() {
        super("Dog name");
    }

    @Override
    public String makeNoise() {
        return "Bark!";
    }

    @Override
    public void eat(String edible) {
        System.out.println("The dog name " + super.name + "has eaten a " + edible);
    }
}
