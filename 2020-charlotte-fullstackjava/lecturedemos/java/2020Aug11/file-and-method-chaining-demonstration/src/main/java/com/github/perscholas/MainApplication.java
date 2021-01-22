package com.github.perscholas;

public class MainApplication {
    public static void main(String[] args) {
        Runnable myObject = System.out::println;
        myObject.run();
    }
}
