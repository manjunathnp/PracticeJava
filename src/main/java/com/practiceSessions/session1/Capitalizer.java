package com.practiceSessions.session1;

import java.util.Scanner;

public class Capitalizer {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String inputStr = scanner.nextLine();

        capitalizer(inputStr);
    }

    private static void capitalizer(String inputStr) {
        char[] charArray = inputStr.toCharArray();
        for(char ch: inputStr.toCharArray()){
            charArray[0] = Character.toUpperCase(charArray[0]);
        }

        for(int i=1; i<inputStr.length(); i++){
            if(charArray[i-1]==' '){
                charArray[i] = Character.toUpperCase(charArray[i]);
            }
        }
        System.out.println(new String(charArray));
    }
}
