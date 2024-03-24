package com.practiceSessions.session3;

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
        StringBuilder revStr = new StringBuilder();

        for(int i= words.length-1; i>=0; i--){
            revStr.append(words[i]+" ");
        }
        System.out.println("Reversed String: "+revStr.toString());
    }


}
