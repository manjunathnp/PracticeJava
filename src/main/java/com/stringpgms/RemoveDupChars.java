package com.stringpgms;

import java.util.Scanner;

public class RemoveDupChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String inputStr = sc.nextLine();

        removeDuplicates(inputStr);
    }

    public static void removeDuplicates(String inputStr){
        String resultantStr = "";

        for(int i=0; i<inputStr.length(); i++){
            char c = inputStr.charAt(i);
            if(resultantStr.indexOf(c)==-1){
                resultantStr += c;
            }
        }
        System.out.println("After removal of duplicates: "+resultantStr);
    }
}
