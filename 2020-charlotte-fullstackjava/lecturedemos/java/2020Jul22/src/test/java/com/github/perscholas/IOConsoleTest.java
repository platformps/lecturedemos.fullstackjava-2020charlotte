package com.github.perscholas;

import com.github.perscholas.generics.GenericPerson;

/**
 * Created by leon on 7/22/2020.
 */
public class IOConsoleTest {
    public static void main(String[] args) {
        IOConsole console = new IOConsole();
        String username = console.getStringInput("What is your name?");
        Integer age = console.getIntegerInput("What is your age?");
        GenericPerson person = new GenericPerson(username, null, age, null);


        console.println("Welcome %s !", username);
        console.println("Welcome %s ! You are %s years old", username, age);
        console.println("Welcome, " + username + "! You are " + age + " years old.");
    }
}
