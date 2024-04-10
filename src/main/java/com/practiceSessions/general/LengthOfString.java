package com.practiceSessions.general;

import java.util.Scanner;

public class LengthOfString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = scanner.nextLine();

        lengthOfInputString(str);
    }

    private static void lengthOfInputString(String str) {
        char[] charArray=str.toCharArray();
        int charCounter=0;
        for(char ch: charArray){
            if(ch != ' '){
                charCounter++;
            }
        }
        System.out.println("Length of input string: "+charCounter);
    }
}
