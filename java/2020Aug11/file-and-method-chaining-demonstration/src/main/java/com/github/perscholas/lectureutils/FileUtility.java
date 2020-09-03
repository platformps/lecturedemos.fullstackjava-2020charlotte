package com.github.perscholas.lectureutils;

import java.io.*;
import java.nio.file.Files;
import java.util.Scanner;

/**
 * Created by leon on 8/11/2020.
 */
public class FileUtility {
    public static String getFileContentAsString(File file) {
        StringBuilder sb = new StringBuilder();
        try {
            Scanner scanner = new Scanner(new BufferedReader(new FileReader(file)));
            while (scanner.hasNext()) {
                sb.append(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }
}
