package com.fileoperations;

import java.io.File;

public class ListAllTheFiles {
    public static void main(String[] args) {
        File directory = new File("src/com/fileoperations/files");
        String[] files=directory.list();

        if(files!=null){
            for(String file: files){
                System.out.println(file);
            }
        }else {
            System.out.println("NO FILES OR DIRECTORY IS EMPTY OR NO SUCH DIRECTORY");
        }
    }
}
