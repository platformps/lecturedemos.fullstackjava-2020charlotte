package com.github.perscholas.abstraction;

import java.util.Scanner;

/**
 * Created by leon on 7/20/2020.
 */
public class IOConsole {
    /**
     * @param prompt - message displayed to user for input
     * @return the value of the user's input as a `String` object
     */
    public String getStringInput(String prompt) {
        this.println(prompt);
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        return userInput;
    }

    public Integer getIntegerInput(String prompt) {
        String userInput = this.getStringInput(prompt);
        Integer intInput = Integer.parseInt(userInput);
        return intInput;
    }

    public void println(String someOutput) {
        System.out.println(someOutput);
    }
}
