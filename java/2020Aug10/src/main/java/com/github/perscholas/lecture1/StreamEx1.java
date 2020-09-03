package com.github.perscholas.lecture1;

import com.github.perscholas.lectureutils.LocalHomeDirectoryReference;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by leon on 8/10/2020.
 */
public class StreamEx1 {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = null;
        Scanner scanner = null;

        try {
            String inputFile = LocalHomeDirectoryReference
                    .DOCUMENTS
                    .getFile("/sample.txt")
                    .getAbsolutePath();

            inputStream = new FileInputStream(inputFile);
            scanner = new Scanner(inputStream);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

            if (scanner.ioException() != null) {
                throw scanner.ioException();
            }
        } finally {
            if(inputStream != null) {
                inputStream.close();
            }

            if(scanner != null) {
                scanner.close();
            }
        }
    }
}
