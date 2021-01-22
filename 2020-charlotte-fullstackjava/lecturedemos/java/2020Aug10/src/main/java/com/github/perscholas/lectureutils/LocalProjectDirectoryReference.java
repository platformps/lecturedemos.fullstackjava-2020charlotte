package com.github.perscholas.lectureutils;

import java.io.File;

/**
 * Created by leon on 8/10/2020.
 */
public enum LocalProjectDirectoryReference {
    RESOURCES("/src/main/resources/"),
    TARGET("/target");

    private final String directoryPath;

    LocalProjectDirectoryReference(String subDirectoryPath) {
        String projectLocalDirectory = System.getProperty("user.dir");
        this.directoryPath = projectLocalDirectory + subDirectoryPath;
    }

    public File getFile(String fileName) {
        return new File(directoryPath + fileName);
    }
}
