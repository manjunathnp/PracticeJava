package com.stringpgms;

import java.util.Scanner;

public class LengthOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String inputStr = sc.nextLine();

        //lengthOfStrWithoutInbuiltMethod(inputStr);

        lengthOfStrWithInbuiltMethod(inputStr);

        //lengthOfStrWithoutInbuiltMethodIgnoringSpaces(inputStr);

        //spacesCount(inputStr);
    }

    private static void spacesCount(String inputStr) {
        int totalSpaceCount=0;
        for(char ch: inputStr.toCharArray()){
            if(ch == ' '){
                totalSpaceCount++;
            }
        }
        System.out.println("Total spaces in Input String: "+totalSpaceCount);
    }

    private static void lengthOfStrWithoutInbuiltMethodIgnoringSpaces(String inputStr) {
        int strCount=0;
        for(char ch: inputStr.toCharArray()){
            if(ch != ' '){
                strCount++;
            }
        }
        System.out.println("String length(without using inbuilt methods) ignoring spaces: "+strCount);

    }

    public static void lengthOfStrWithoutInbuiltMethod(String inputStr){
        int strCount=0;
        for(char ch: inputStr.toCharArray()){
            strCount++;
        }
        System.out.println("String length(without using inbuilt methods): "+strCount);
    }

    public static void lengthOfStrWithInbuiltMethod(String inputStr){
        int strCount = inputStr.length();
        System.out.println("String length(inbuilt methods): "+strCount);

    }
}
