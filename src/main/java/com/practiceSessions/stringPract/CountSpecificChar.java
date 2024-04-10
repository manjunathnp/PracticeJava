package com.practiceSessions.stringPract;

import java.util.Scanner;

public class CountSpecificChar {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String inpStr = scanner.nextLine();

        System.out.println("Enter the character to count: ");
        char ch = scanner.nextLine().charAt(0);

        characterCounter(inpStr, ch);
    }

    private static void characterCounter(String inpStr, char ch) {
        int charCounter = 0;

        for(char character: inpStr.toCharArray()){
            if(character==ch){
                charCounter++;
            }
        }
        System.out.println("Occrrances of "+ch+" = "+charCounter);
    }
}
