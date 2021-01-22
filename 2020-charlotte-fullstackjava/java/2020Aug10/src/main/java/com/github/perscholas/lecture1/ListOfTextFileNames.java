package com.github.perscholas.lecture1;

import java.io.File;

/**
 * Created by leon on 8/10/2020.
 */
public class ListOfTextFileNames {
    public static void main(String[] args) {
        String homeDirectory = System.getProperty("user.home");
        String sourceDirectory = homeDirectory + "/Desktop";
        File file = new File(sourceDirectory);
        String[] fileNames = file.list();
        for(String fileName : fileNames) {
            if(fileName.endsWith(".txt")) {
                System.out.println(fileName);
            }
        }
    }
}
