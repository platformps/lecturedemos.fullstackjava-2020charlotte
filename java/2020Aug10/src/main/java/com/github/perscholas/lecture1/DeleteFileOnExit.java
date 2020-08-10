package com.github.perscholas.lecture1;

import java.io.File;
import java.io.IOException;

/**
 * Created by leon on 8/10/2020.
 */
public class DeleteFileOnExit {
    public static void main(String[] args) {
        File temp;
        try {
            String tempFileName = "C:/Users/CTAdmin/Documents/tempFile";
            String tempFileExtension = ".txt";
            temp = File.createTempFile(tempFileName, tempFileExtension);

            // temp.delete(); // for deleting immediately

            temp.deleteOnExit(); // delete on runtime exit

            System.out.println("Temp file eixists: " + temp.exists());
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }
}
