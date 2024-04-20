package com.programsets.set1.Wed170424;

import java.util.Scanner;

public class RemoveDuplicateChar {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String inputStr = scanner.nextLine();

        removeDuplicateChar(inputStr);
    }
    private static void removeDuplicateChar(String inputStr){
        String resStr = "";

        for(int i=0; i<inputStr.length(); i++){
            if(resStr.indexOf(inputStr.charAt(i))==-1){
                resStr +=  inputStr.charAt(i);
            }
        }
        System.out.println(resStr);
    }
}
