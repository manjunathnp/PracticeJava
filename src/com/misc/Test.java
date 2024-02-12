package com.misc;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String inputStr = sc.nextLine();

        /*System.out.println("To lowercase: "+inputStr.toLowerCase());
        System.out.println("To uppercase: "+inputStr.toUpperCase());*/

        toUpperCase(inputStr);
        toLowerCase(inputStr);

    }
    private static void toUpperCase(String inputStr){
        char[] charArray = inputStr.toCharArray();
        for(int i=0; i<charArray.length; i++){
            if(charArray[i] >= 'a' && charArray[i] <= 'z'){
                charArray[i] -= 32;
            }
        }
        String toUpperCaseString = new String(charArray);
        System.out.println("To Uppercase: "+toUpperCaseString);
    }


    private static void toLowerCase(String inputStr){
        char[] charArray = inputStr.toCharArray();
        for(int i=0; i<charArray.length; i++){
            if(charArray[i] >= 'A' && charArray[i] <= 'Z'){
                charArray[i] += 32;
            }
        }
        String toLowerCaseString = new String(charArray);
        System.out.println("To Lowercase: "+toLowerCaseString);
    }


}
