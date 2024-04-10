package com.practiceSessions.stringPract;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String inputStr = scanner.nextLine();

        reverseString(inputStr);
        reverseWords(inputStr);
    }

    private static void reverseString(String inputStr){
        String[] words=inputStr.split("\\s");
        String reversedString = "";

        for(int i= words.length-1; i>=0; i--){
            reversedString += words[i]+" ";
        }
        System.out.println("Reversed String: "+reversedString);
    }

    private static void reverseWords(String inputStr){
        String[] words=inputStr.split("\\s");
        String reversedString="";
        for(int i=words.length-1; i>=0; i--){
            reversedString += words[i]+" ";
        }

        String[] reversedStringWords = reversedString.split("\\s");
        StringBuilder reversedWord = new StringBuilder();
        for(String word: reversedStringWords){
            for(int i=word.length()-1; i>=0; i--){
                reversedWord.append(word.charAt(i));
            }
            reversedWord.append(" ");
        }

        System.out.println("Reversed Words: "+reversedWord.toString());



    }
}





