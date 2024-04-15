package com.revision.session1;

import java.util.Scanner;

public class WordReversalString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String inputStr = scanner.nextLine();

        wordReversalString(inputStr);
    }

    private static void wordReversalString(String inputStr){
        String reversedString = "";
        String[] words=inputStr.split("\\s");
        for(int i=words.length-1; i>=0; i--){
            reversedString += words[i]+ " ";
        }
        System.out.println(reversedString);
    }
}
