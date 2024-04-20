package com.programsets.set3.Fri190424;

import java.util.Scanner;

public class ReversalWords {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String inputStr = scanner.nextLine();

        reverseWords(inputStr);
    }
    private static void reverseWords(String inputStr){
        String[] words = inputStr.split("\\s");
        String reversedString="";
        for(int i=words.length-1; i>=0; i--){
            reversedString += words[i]+" ";
        }
        System.out.println("Reversed String: "+reversedString);

        String[] revWords = reversedString.split("\\s");
        StringBuilder resStr = new StringBuilder();
        for(String revWord: revWords){
            for(int i=revWord.length()-1; i>=0; i--){
                resStr.append(revWord.charAt(i));
            }
            resStr.append(" ");
        }
        System.out.println(resStr);
    }
}
