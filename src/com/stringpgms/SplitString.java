package com.stringpgms;

import java.util.Scanner;

public class SplitString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String inputStr = sc.nextLine();

        splittingString(inputStr);
    }

    private static void splittingString(String inputStr) {
        String[] words = inputStr.split("\s");
        for(String word: words){
            System.out.println(word);
        }
    }
}
