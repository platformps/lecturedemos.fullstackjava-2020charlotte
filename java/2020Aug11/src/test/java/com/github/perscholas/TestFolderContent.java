package com.github.perscholas;

import org.junit.Test;

import java.io.File;
import java.util.Scanner;

/**
 * Created by leon on 8/11/2020.
 */
public class TestFolderContent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter directory path:");
        String directoryPath = scanner.nextLine();

        System.out.println("Enter sub-directory name");
        String subDirectoryName = scanner.nextLine();

        File file = new File(directoryPath, subDirectoryName);
        if(file.exists()) {
            String[] filesNamesInDirectory = file.list();
            int numberOfEntries = filesNamesInDirectory.length;
            for (int i = 0; i < filesNamesInDirectory.length; i++) {
                String currentFileName = filesNamesInDirectory[i];
                File newFile = new File(currentFileName);
                if(newFile.isFile()) {
                    System.out.println(": is a file");
                }
            }
            System.out.println("Number of files in this directory = " + numberOfEntries);
        } else {
            System.out.println(directoryPath +"\\"+ subDirectoryName + " not found");
        }
    }
}
