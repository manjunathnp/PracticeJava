package com.practiceSessions.stringPract;

import java.util.Scanner;

public class Capitalization {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the input string: ");
        String inputStr = scanner.nextLine();

        capitalization(inputStr);
    }
    private static void capitalization(String inputStr){
        char[] charArray = inputStr.toCharArray();

        for(char character: charArray){
            charArray[0]=Character.toUpperCase(charArray[0]);
        }

        for(int i=1; i<charArray.length; i++){
            if(charArray[i-1]==' '){
                charArray[i]=Character.toUpperCase(charArray[i]);
            }
        }
        System.out.println("After Capitalization: "+new String(charArray));
    }
}
