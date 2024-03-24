package com.fileoperations;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter=new FileWriter("src/com/fileoperations/files/testfile.txt");
        fileWriter.write("hello world!");
        fileWriter.close();
        System.out.println("Successfully wrote to file!");
    }
}
