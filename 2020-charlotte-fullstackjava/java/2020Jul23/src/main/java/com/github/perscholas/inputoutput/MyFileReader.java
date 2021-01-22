package com.github.perscholas.inputoutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by leon on 7/23/2020.
 */
public class MyFileReader {
    public String readFile(String fileName) {
        // given
        File file = new File(fileName);
        Scanner scanner;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        // when
        String fileContent = "";
        while(scanner.hasNextLine()) {
            String currentLineContent = scanner.nextLine();
            fileContent += currentLineContent +'\n';
        }
        return fileContent;
    }
}
