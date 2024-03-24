package com.practiceSessions.session2;

import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the input string: ");
        String inputStr = scanner.nextLine();

        stringReverse(inputStr);
    }

    private static void stringReverse(String inputStr) {
        String[] words=inputStr.split("\s");
        String reversedStr = "";
        for(int i= words.length-1; i>=0; i--){
            reversedStr += words[i]+" ";
        }
        System.out.println("Reversed String: "+reversedStr);
    }
}
