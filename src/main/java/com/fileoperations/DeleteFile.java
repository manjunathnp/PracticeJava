package com.fileoperations;

import java.io.File;
import java.io.IOException;

public class DeleteFile {
    public static void main(String[] args) throws IOException {
        File file = new File("src/com/fileoperations/files/destination1.txt");
        file.createNewFile();
        if(file.exists()){
            file.delete();
            System.out.println("FILE DELETED SUCCESSFULLY!");
        }else {
            System.out.println("FILE DOESN'T EXISTS");
        }
    }
}
