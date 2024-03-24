package com.stringpgms;

import java.util.Scanner;

public class CaseConversions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String inputStr = sc.nextLine();

        convertStrToUpperUsingBuiltInMethods(inputStr);
        convertStrToLowerUsingBuiltInMethods(inputStr);

        convertStrToLowerWithoutUsingBuiltInMethods(inputStr);
        convertStrToUpperWithoutUsingBuiltInMethods(inputStr);

    }

    private static void convertStrToUpperWithoutUsingBuiltInMethods(String inputStr) {
        String resultantStr;

        char[] chArray = inputStr.toCharArray();
        for(int i=0; i<chArray.length; i++){
            if(chArray[i] >= 'a' &&  chArray[i] <= 'z'){
                chArray[i] -= 32;
            }
        }
        resultantStr = new String(chArray);
        System.out.println("Uppercase String (without Built-in Method): "+resultantStr);
    }

    private static void convertStrToLowerWithoutUsingBuiltInMethods(String inputStr) {
        String resultantStr;
        char[] chArray = inputStr.toCharArray();

        for(int i=0; i<chArray.length; i++){
            if(chArray[i] >= 'A' && chArray[i] <= 'Z'){
                chArray[i] += 32;
            }
        }
        resultantStr = new String(chArray);
        System.out.println("Lowercase String (without Built-in Method): "+resultantStr);
    }

    private static void convertStrToLowerUsingBuiltInMethods(String inputStr) {
        String resultantStr = inputStr.toLowerCase();
        System.out.println("Lowercase String: "+resultantStr);
    }

    private static void convertStrToUpperUsingBuiltInMethods(String inputStr) {
        String resultantStr = inputStr.toUpperCase();
        System.out.println("Uppercase String: "+resultantStr);
    }
}
