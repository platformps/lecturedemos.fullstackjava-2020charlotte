package com.github.perscholas.lecture1;

import com.github.perscholas.lectureutils.LocalProjectDirectoryReference;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Created by leon on 8/10/2020.
 */
public class ScannerEx2 {
    public static void main(String[] args) throws FileNotFoundException {
        // 2 - create file-object using the location identified
        File readIn = LocalProjectDirectoryReference.RESOURCES.getFile("input.txt");
        Scanner scanner = null;
        BufferedReader bufferedReader;
        FileReader inputStream;
        Double sum = 0.0;

        try {
            inputStream = new FileReader(readIn);
            bufferedReader = new BufferedReader(inputStream);
            scanner = new Scanner(bufferedReader);
            while(scanner.hasNext()) {
                if(scanner.hasNextDouble()) {
                    sum += scanner.nextDouble();
                } else  {
                    System.out.println(scanner.next());
                }
            }
        } finally {
            if(scanner != null) {
                scanner.close();
            }
        }
        System.out.println("Total sum is " + sum);
    }
}
