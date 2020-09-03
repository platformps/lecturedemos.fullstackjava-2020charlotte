package com.github.perscholas.lecture2;

import com.github.perscholas.lectureutils.LocalHomeDirectoryReference;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by leon on 8/10/2020.
 */
public class BinaryFilesReadEx1 {
    public static void main(String[] args) {
        // get `sample-in.txt` file from Documents directory
        String fileName = LocalHomeDirectoryReference.DOCUMENTS.getFileName("/sample-in.txt");

        // use this for reading the data
        byte[] buffer = new byte[1000];

        try {
            FileInputStream inputStream = new FileInputStream(fileName);
            // read fills buffer with data and returns
            // the number of bytes read (which of course
            // may be less than the buffer size, but
            // it will never be more).
            int total = 0;
            int nRead = 0;
            while((nRead = inputStream.read(buffer)) != -1) {
                // Convert to String so we can display it easily
                // do not do this with a "real" binary file.
                System.out.println(new String(buffer));
                total += nRead;
            }
        } catch(FileNotFoundException fnfe) {
            String errorMessage = "Unable to open file [ %s ]";
            throw new RuntimeException(String.format(errorMessage, fileName), fnfe);
        } catch(IOException ioe) {
            String errorMessage = "Unable to read file [ %s ]";
            throw new RuntimeException(String.format(errorMessage, fileName), ioe);
        }
    }
}
