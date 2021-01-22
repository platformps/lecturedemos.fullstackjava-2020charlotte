package com.github.perscholas.abstraction;

/**
 * Created by leon on 7/21/2020.
 */
abstract public class Animal implements NoiseMaker, Eater {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }
}