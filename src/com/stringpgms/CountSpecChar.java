package com.stringpgms;

import java.util.Scanner;

public class CountSpecChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String inputStr = sc.nextLine();

        System.out.println("Enter the character: ");
        char strCh = sc.next().charAt(0);

        countChar(strCh, inputStr);
    }
    public static void countChar(char strCh, String inputStr){
        int characterCount=0;
        for(char ch: inputStr.toCharArray()){
            if(ch==strCh){
                characterCount++;
            }
        }
        System.out.println("Total occurrences of "+strCh+": "+characterCount);
    }
}
