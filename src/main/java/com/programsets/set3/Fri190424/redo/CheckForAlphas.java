package com.programsets.set3.Fri190424.redo;

import java.util.Scanner;

public class CheckForAlphas {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String inputStr = scanner.nextLine();

        checkForAlphas(inputStr);
    }
    private static void checkForAlphas(String inputStr){
        char[] charArray=inputStr.toCharArray();

        if(inputStr.matches("[a-zA-Z\s]+")){
            System.out.println("Only Alphabets");
        }else if(inputStr.matches("[a-zA-Z0-9\s]+")){
            System.out.println("Alpha Numerics");
        }else if(inputStr.isEmpty()){
            System.out.println("Empty String");
        }
    }
}
