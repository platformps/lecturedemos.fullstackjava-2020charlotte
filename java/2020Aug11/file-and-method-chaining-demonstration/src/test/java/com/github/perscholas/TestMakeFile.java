package com.github.perscholas;

import com.github.perscholas.lectureutils.LocalProjectDirectoryReference;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * Created by leon on 8/11/2020.
 */
public class TestMakeFile {
    @Test
    public void makeDirectory() {
        File file = LocalProjectDirectoryReference.TARGET.getFile("new-folder");
        file.mkdir();
    }

    @Test
    public void makeFile() {
        File file = LocalProjectDirectoryReference.TARGET.getFile("new-folder/sample.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
