package com.github.perscholas.monica;

/**
 * Created by leon on 8/10/2020.
 */
public interface SomeFunctionalInterface {
    void soutHello();

    default void soutHey() {
        System.out.println("hey");
    }

    static void soutHi() {
        System.out.println("hi");
    }
}
