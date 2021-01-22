package com.github.perscholas.lecture1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Created by leon on 8/10/2020.
 */
public class ScannerEx1 {
    public static void main(String[] args) throws FileNotFoundException {
        // 1 - identify location of file
        String projectLocalDirectory = System.getProperty("user.dir");
        String fileInPath = projectLocalDirectory + "/src/main/resources/input.txt";

        // 2 - create file-object using the location identified
        File readIn = new File(fileInPath);
        BufferedReader bufferedReader;
        FileReader fileReader;
        Scanner scanner = null;

        try {

            // 3 - create a file reader using the file-object
            fileReader = new FileReader(readIn);

            // 4 - create buffered reader using the file-reader
            bufferedReader = new BufferedReader(fileReader);

            // 5 - create a scanner using the buffered reader
            scanner = new Scanner(bufferedReader);

            // 6 - check to see if there is any input on the current line
            while (scanner.hasNext()) {
                // 7 - print out input on current line
                System.out.println(scanner.next());
            }
        } finally {
            if (scanner != null) {
                scanner.close(); // close scanner,
                // which closes buffered reader,
                // which closes file reader,
                // which closes file
            }
        }
    }
}
