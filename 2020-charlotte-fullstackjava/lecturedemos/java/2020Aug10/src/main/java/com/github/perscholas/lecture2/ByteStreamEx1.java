package com.github.perscholas.lecture2;

import com.github.perscholas.lectureutils.LocalHomeDirectoryReference;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by leon on 8/10/2020.
 */
public class ByteStreamEx1 {
    public static void main(String[] args) {
        FileInputStream fis;
        FileOutputStream fos;
        try {
            String inputFileName = LocalHomeDirectoryReference
                    .DOCUMENTS
                    .getFileName("sample.txt");
            String outputFileName = LocalHomeDirectoryReference
                    .DOCUMENTS
                    .getFileName("sampleTo.txt");

            fis = new FileInputStream(inputFileName);
            fos = new FileOutputStream(outputFileName);
            int temp;
            while ((temp = fis.read()) != -1) { // read byte by byte
                fos.write((byte) temp);
            }

            if (fis != null) {
                fis.close();
            }
            if (fos != null) {
                fos.close();
            }
        } catch (IOException ioe) {
            throw new RuntimeException(ioe);
        }
    }
}
