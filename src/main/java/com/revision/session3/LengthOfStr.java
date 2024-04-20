package com.revision.session3;

import java.util.Scanner;

public class LengthOfStr {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the input string: ");
        String inputStr = scanner.nextLine();

        lengthOfStr(inputStr);
    }
    private static void lengthOfStr(String inputStr){
        int characterCounter=0;
        for(char character: inputStr.toCharArray()){
            characterCounter++;
        }
        System.out.println("Length of input string: "+characterCounter);
    }
}
