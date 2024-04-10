package com.practiceSessions.general;

import java.util.Scanner;

public class WordsCount {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String inputStr = scanner.nextLine();

        String[] words = inputStr.split("\s");
        System.out.println("Total words: "+words.length);
    }
}
