package com.stringpgms;

import java.util.Scanner;

public class CheckOnlyAlpha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String inputStr = sc.nextLine();

        checkForOnlyAlphabets(inputStr);
    }

    private static void checkForOnlyAlphabets(String inputStr) {
        if(inputStr.isEmpty()){
            System.out.println("Empty String");
        }else if(inputStr.matches("[a-zA-Z\s]+")){
            System.out.println("Contains only alphabets");
        }else if(inputStr.matches("[a-zA-Z0-9\s]+")){
            System.out.println("Contains Alpha numeric");
        }else{
            System.out.println("Contains combination of alphanumeric and special characters");
        }
    }

}
