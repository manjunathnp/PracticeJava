package com.revision.redo;

import java.util.Scanner;

public class WordsReversal {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String inputStr = scanner.nextLine();

        wordsReversal(inputStr);
    }

    private static void wordsReversal(String inputStr){
        String[] words = inputStr.split("\\s");
        String reversedString = "";

        for(int i=words.length-1; i>=0; i--){
            reversedString+= words[i]+" ";
        }
        System.out.println("Reversed String: ");
        System.out.println(reversedString);

        String[] revWords = reversedString.split("\\s");
        StringBuilder wordReversal=new StringBuilder();
        for(String word: revWords){
            for(int i=word.length()-1; i>=0; i--){
                wordReversal.append(word.charAt(i));
            }
           wordReversal.append(" ");
        }
        System.out.println("After complete Reversal: "+wordReversal.toString());

    }
}
