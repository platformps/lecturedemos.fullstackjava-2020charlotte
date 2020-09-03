package com.github.perscholas.lecture2;

import com.github.perscholas.lectureutils.LocalHomeDirectoryReference;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by leon on 8/10/2020.
 */
public class BinaryFilesWriteEx2 {
    public static void main(String[] args) {
        // the name of the file to open
        String fileName = LocalHomeDirectoryReference.DOCUMENTS.getFileName("sample-in.txt");
        try {
            // assume default character encoding
            FileWriter fileWriter = new FileWriter(fileName);

            // always wrap FileWriter in BufferedWriter
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Note that `write()` does not automatically append a newline character.
            bufferedWriter.write("Daft Punk - One More Time");
            bufferedWriter.write("Hello there,");
            bufferedWriter.write(" here is some text.");
            bufferedWriter.newLine();

            bufferedWriter.write("We are writing");
            bufferedWriter.write("the text to the file.");

            bufferedWriter.flush();

            // always close files
            bufferedWriter.close();
        } catch(IOException ioe) {
            String errorMessage = "Error writing to file [ %s ]";
            throw new RuntimeException(String.format(errorMessage, fileName), ioe);
        }
    }
}
