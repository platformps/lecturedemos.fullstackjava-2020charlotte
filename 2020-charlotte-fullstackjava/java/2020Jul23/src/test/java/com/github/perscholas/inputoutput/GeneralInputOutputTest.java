package com.github.perscholas.inputoutput;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by leon on 7/23/2020.
 */
public class GeneralInputOutputTest {
    @Test
    public void testCreateNewFile() {
        String currentLocalDirectory = System.getProperty("user.dir");
        String filePath = currentLocalDirectory + "\\src\\main\\resources\\write-this.txt";
        File file = new File(filePath);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Test
    public void testReadEntireFile() {
        // given
        String currentLocalDirectory = System.getProperty("user.dir");
        String filePath = currentLocalDirectory + "\\src\\main\\resources\\read-this.txt";
        File file = new File(filePath);
        Scanner scanner;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        // when
        String fileContent = "";
        while (scanner.hasNextLine()) {
            String currentLineContent = scanner.nextLine();
            fileContent += currentLineContent + '\n';
        }

        // then
        System.out.println(fileContent);
    }


    @Test
    public void testWriteToFile() {
        // given
        String currentLocalDirectory = System.getProperty("user.dir");
        String filePath = currentLocalDirectory + "\\src\\main\\resources\\read-this.txt";
        File fileToBeWrittenTo = new File(filePath);
        boolean shouldAppendOnWrite = true;
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter(fileToBeWrittenTo, shouldAppendOnWrite);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // when
        try {
            fileWriter.write("\nHello world!");
            fileWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // then
        String fileContent = new MyFileReader().readFile(filePath);
        System.out.println(fileContent);

    }
}
