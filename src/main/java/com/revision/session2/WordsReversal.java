package com.revision.session2;

import java.util.Scanner;

public class WordsReversal {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the input string: ");
        String inputStr = scanner.nextLine();

        wordsReversal(inputStr);
    }
    private static void wordsReversal(String inputStr){
        String[] words=inputStr.split("\s");
        StringBuilder reversedString = new StringBuilder();
        for(int i= words.length-1; i>=0; i--){
            reversedString.append(words[i]+" ");
        }
        System.out.println("Reversed String:\n"+new String(reversedString));

        String[] revWords = reversedString.toString().split("\s");
        StringBuilder finalResString = new StringBuilder();
        for(String revWord: revWords){
            for(int i=revWord.length()-1; i>=0; i--){
                finalResString.append(revWord.charAt(i));
            }
            finalResString.append(" ");
        }
        System.out.println("Final Resultant String:\n"+finalResString.toString());
    }
}
