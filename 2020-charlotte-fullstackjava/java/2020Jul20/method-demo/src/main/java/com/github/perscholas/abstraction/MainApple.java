package com.github.perscholas.abstraction;

import com.github.perscholas.Person;

import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by leon on 7/20/2020.
 */
public class MainApple {
    public static void main(String[] args) {
        new MainApple().withAbstraction();
    }

    public void withAbstraction() {
        IOConsole console = new IOConsole();
        String promptName = "What is your name?";
        String promptAge = "What is your age?";
        String userInputName = console.getStringInput(promptName);
        Integer userInputAge = console.getIntegerInput(promptAge);
        Person person = new Person(userInputName, userInputAge);
        console.println(person.toString());
    }


    public void withoutAbstraction() {
        InputStream inputStream = System.in;
        Scanner scanner = new Scanner(inputStream);
        String promptName = "What is your name?";
        String promptAge = "What is your age?";

        System.out.println(promptName);
        String stringName = scanner.nextLine();

        System.out.println(promptAge);
        String stringAge = scanner.nextLine();
        Integer intAge = Integer.parseInt(stringAge);

        System.out.println("Name = " + stringName);
        System.out.println("Age = " + intAge);
    }
}
