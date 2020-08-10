package com.github.perscholas.lecture1;

import java.io.*;

/**
 * Created by leon on 8/10/2020.
 * The purpose of this class is to demonstrate how to read the contents from one file and write them to another file
 */
public class IOEx1 {
    public static void main(String[] args) throws IOException {
        FileReader inputStream = null;
        FileWriter outputStream = null;
        String projectLocalDirectory = System.getProperty("user.dir");
        String fileInPath = projectLocalDirectory + "/src/main/resources/input.txt";
        String fileOutPath = projectLocalDirectory + "/src/main/resources/output.txt";

        File readIn = new File(fileInPath);
        File writeTo = new File(fileOutPath);

        try {
            inputStream = new FileReader(readIn);
            outputStream = new FileWriter(writeTo);
            int c;
            do {
                c = inputStream.read();
                outputStream.write(c);
            } while(c != -1);
        } finally {
            if(inputStream != null) {
                inputStream.close();
            }
            if(outputStream != null) {
                outputStream.close();
            }
        }

    }
}
