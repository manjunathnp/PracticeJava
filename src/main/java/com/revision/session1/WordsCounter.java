package com.revision.session1;

import java.util.Scanner;

public class WordsCounter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String inputStr = scanner.nextLine();

        wordsCounter(inputStr);
    }

    private static void wordsCounter(String inputStr){
        int wordCounter = 0;
        String[] words = inputStr.split("\\s");
        System.out.println("Total words: "+words.length);
    }
}
