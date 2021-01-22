package com.github.perscholas.monica;

/**
 * Created by leon on 8/10/2020.
 */
public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        SomeFunctionalInterface sfi = () -> System.out.println("Hey There");

        SomeInterface si = () -> {
            System.out.println("Hey");
            System.out.println("Yerp");
        };
    }
}
