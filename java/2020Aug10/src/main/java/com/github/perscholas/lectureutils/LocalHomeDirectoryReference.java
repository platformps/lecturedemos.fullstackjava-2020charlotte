package com.github.perscholas.lectureutils;

import java.io.File;

/**
 * Created by leon on 8/10/2020.
 */
public enum LocalHomeDirectoryReference {
    DESKTOP("/Desktop"),
    DOCUMENTS("/Documents"),
    DEV("/dev");

    private final String targetDirectory;

    LocalHomeDirectoryReference(String localDirectoryPath) {
        String homeDirectory = System.getProperty("user.home");
        this.targetDirectory = homeDirectory + localDirectoryPath;
    }

    public File getFile(String fileName) {
        return new File(getFileName(fileName));
    }

    public String getFileName(String fileName) {
        if (fileName.startsWith("/")) {
            return targetDirectory + fileName;
        }
        return getFileName("/" + fileName);
    }
}
