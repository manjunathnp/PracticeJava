package com.fileoperations;

import java.io.File;
import java.io.IOException;

public class CreateNewFile {
    public static void main(String[] args) throws IOException {
        File file = new File("src/com/fileoperations/files/testfile1.txt");
        if(file.createNewFile()){
            System.out.println("File created: "+file.getName());
        }else{
            System.out.println("File already exists!");
        }
    }
}
