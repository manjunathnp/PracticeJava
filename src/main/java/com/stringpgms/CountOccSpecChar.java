package com.stringpgms;

import java.util.Scanner;

public class CountOccSpecChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String inputStr = sc.nextLine();

        System.out.println("Enter the character: ");
        char strCh = sc.next().charAt(0);

        countCharOccurrence(inputStr, strCh);
    }

    public static void countCharOccurrence(String inputStr, char strCh){
        int charCount=0;
        for(char character: inputStr.toCharArray()){
            if(character==strCh){
                charCount++;
            }
        }
        System.out.println("Occrrence of character "+strCh+" = "+charCount);
    }
}
