package com.programsets.set2.Thu180424;

import java.util.Scanner;

public class WordCounterDemo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String inputStr=scanner.nextLine();

        wordCounter(inputStr);
    }
    private static void wordCounter(String inputStr){
        String[] words=inputStr.split("\s+");

        System.out.println("In-built words counter: "+words.length);
        int counter=0;
        for(String word: words){
            counter++;
        }
        System.out.println("Total words: "+counter);
    }
}
