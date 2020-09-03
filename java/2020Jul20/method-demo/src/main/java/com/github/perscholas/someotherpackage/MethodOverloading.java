package com.github.perscholas.someotherpackage;

import java.util.Scanner;

/**
 * Created by leon on 7/20/2020.
 */
public class MethodOverloading {

    public static String getInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        String userInput = scanner.nextLine();
        return userInput;
    }

    public static String getInput(int numberOfInputPrompts) {
        Scanner scanner = new Scanner(System.in);
        int currentPromptNumber = 1;
        String output = "";
        while (currentPromptNumber<=numberOfInputPrompts) {
            System.out.println("What is your word? [" + currentPromptNumber + "]");
            output += "," + scanner.nextLine();
        }
        return output;
    }
}
