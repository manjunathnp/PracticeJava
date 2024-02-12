package com.stringpgms;

import java.util.Scanner;

public class RemoveSubStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String inputStr = sc.nextLine();

        System.out.println("Enter the sub-string: ");
        String subStr = sc.nextLine();

        removeSubString(inputStr, subStr);
    }

    private static void removeSubString(String inputStr, String subStr) {
        String[] words = inputStr.split("\\b"+subStr+"\\b");
        StringBuilder sb = new StringBuilder();
        for(String word: words){
            sb.append(word).append(" ");
        }
        String resultantStr = sb.toString().trim();
        System.out.println("Resultant String: "+resultantStr);
    }
}
