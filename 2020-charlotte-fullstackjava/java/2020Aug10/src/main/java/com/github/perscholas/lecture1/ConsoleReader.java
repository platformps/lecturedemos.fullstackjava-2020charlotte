package com.github.perscholas.lecture1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by leon on 8/10/2020.
 */
public class ConsoleReader {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input name:");
        String name = reader.readLine();
        System.out.println("The name that was input was: " + name);
    }
}
