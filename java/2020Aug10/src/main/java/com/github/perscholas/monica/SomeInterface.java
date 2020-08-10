package com.github.perscholas.monica;

/**
 * Created by leon on 8/10/2020.
 */
@FunctionalInterface
public interface SomeInterface {
    void oneMethod();

    default void secondMethod() {
        System.out.println("Is this still a valid functional interface?");
    }

    static void thirdMethod() {
        System.out.println("This is indeed still a valid functional interface");
    }
}
