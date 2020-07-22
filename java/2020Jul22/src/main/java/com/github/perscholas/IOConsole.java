package com.github.perscholas;

import java.util.Scanner;

/**
 * Created by leon on 7/22/2020.
 */
public class IOConsole {
    public Integer getIntegerInput(String prompt) {
        return Integer.parseInt(getStringInput(prompt));
    }

    public String getStringInput(String prompt) {
        println(prompt);
        return new Scanner(System.in).nextLine();
    }

    public void println(String messageToBeFormatted, Object... arguments) {
        String outputMessage = String.format(messageToBeFormatted, arguments);
        System.out.println(outputMessage);
    }

    public void print(int... args) {

    }
}
