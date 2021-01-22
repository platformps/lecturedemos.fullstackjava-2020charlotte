package com.github.perscholas.exceptions;

import com.github.perscholas.exceptions.IOExceptionHandler;
import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by leon on 7/23/2020.
 */
public class CheckedExceptionsTest {
    @Test(expected = RuntimeException.class)
    public void testTryCatchThrow() {
        FileWriter fileWriter = null;
        String fileName = "";
        try {
            fileWriter = new FileWriter(fileName);
        } catch (IOException io) {
            // todo - some other logic to be defined here
            IOExceptionHandler exceptionHandlerObject = new IOExceptionHandler(io);
            try {
                exceptionHandlerObject.createMissingFile(fileName);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            fileWriter = exceptionHandlerObject.getFileWriter();
        }


        try {
            fileWriter.write("Some text to the file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void test() {
        try {
            testThrowsClause();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void testThrowsClause() throws IOException {
        FileWriter fileWriter = null;
        String fileName = "";
        fileWriter = new FileWriter(fileName);
        fileWriter.write("Some text to the file");
    }
}
