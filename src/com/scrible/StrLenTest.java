package com.scrible;

import java.util.Scanner;

public class StrLenTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter te input string: ");
        String inputStr = sc.nextLine();


        strLengthUsingIBM(inputStr);

        strLengthWithoutIBM(inputStr);

        strLengthWithoutIBMIgnoreSpaces(inputStr);
    }

    private static void strLengthWithoutIBMIgnoreSpaces(String inputStr) {
        int charCount=0;
        char[] charArray = inputStr.toCharArray();
        for(char c: charArray){
            if(c != ' '){
                charCount++;
            }
        }
        System.out.println("Length of input string(without IBM) ignoring spaces: "+charCount);
    }

    private static void strLengthWithoutIBM(String inputStr) {
        int charCount=0;
        char[] charArray=inputStr.toCharArray();

        for(char c: charArray){
            charCount++;
        }
        System.out.println("Length of input string(without IBM): "+charCount);
    }

    private static void strLengthUsingIBM(String inputStr) {
        System.out.println("Length of input string: "+inputStr.length());
    }
}
