package com.github.perscholas.abstraction;

/**
 * Created by leon on 7/21/2020.
 */
public class Car implements NoiseMaker {
    @Override
    public String makeNoise() {
        return "Vroom!";
    }
}
