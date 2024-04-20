package com.programsets.set3.Fri190424;

import java.util.Scanner;

public class Capitalize {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String inputStr = scanner.nextLine();

        capitalize(inputStr);
    }
    private static void capitalize(String inputStr){
        char[] charArray=inputStr.toCharArray();

        for(int i=0; i<charArray.length; i++){
            charArray[0] = Character.toUpperCase(charArray[0]);
        }

        for(int i=1; i<charArray.length; i++){
            if(charArray[i-1]==' '){
                charArray[i] = Character.toUpperCase(charArray[i]);
            }
        }
        System.out.println("Resultant String: "+new String(charArray));
    }
}
