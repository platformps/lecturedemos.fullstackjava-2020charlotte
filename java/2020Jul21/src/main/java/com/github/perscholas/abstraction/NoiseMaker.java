package com.github.perscholas.abstraction;

/**
 * Created by leon on 7/21/2020.
 */
public interface NoiseMaker {
    default String makeNoise() {
        return "BOOM!";
    }
}
