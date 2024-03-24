package com.fileoperations;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) throws IOException {
        FileReader fileReader=new FileReader("src/com/fileoperations/files/testfile.txt");

        Scanner scanner = new Scanner(fileReader);
        while (scanner.hasNextLine()){
            String data=scanner.nextLine();
            System.out.println(data);
        }
        scanner.close();
        fileReader.close();
    }
}
