package com.fileoperations;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Random;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        File srcFile = new File("src/com/fileoperations/files/source1.txt");
        File destFile = new File("src/com/fileoperations/files/destination1.txt");

        FileWriter fileWriter = new FileWriter(srcFile);
        fileWriter.write("This is test file");

        fileWriter.close();
        Files.copy(srcFile.toPath(), destFile.toPath());
    }
}
