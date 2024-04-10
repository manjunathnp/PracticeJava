package com.stringpgms;

import java.util.Scanner;

public class CheckAlphaCount {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Input String: ");
        String inputStr = scanner.nextLine();

        checkAlphaCount(inputStr);
    }

    private static void checkAlphaCount(String inputStr) {
        int alphabets=0, nonAlphabets=0;
        boolean alphabetsPresent=false;

        for(char character: inputStr.toCharArray()){
            if(Character.isAlphabetic(character)){
                alphabets++;
                alphabetsPresent=true;
            }else{
                alphabetsPresent=false;
                nonAlphabets++;
            }
        }
        if(alphabetsPresent){
            System.out.println("Input string has pure alphabets");
        }
        System.out.println("Total Alphabets: "+alphabets);
        System.out.println("Total Non-Alphabets: "+nonAlphabets);
    }
}
