package com.github.perscholas.exceptions;

import java.io.FileWriter;
import java.io.IOException;
import java.util.UUID;

/**
 * Created by leon on 7/23/2020.
 */
public class IOExceptionHandler {
    public IOExceptionHandler(IOException io) {
    }

    public void createMissingFile(String fileName) throws Exception {
        // todo - try to create the file that was not found
        // if the file-name that is specified is an invalid-file name,
        // then threw another exception stating, 'invalid-file name for new-file creation'
        throw new RuntimeException("Invalid file name for new file creation");
    }

    public FileWriter getFileWriter() {
        return null;
    }
}
