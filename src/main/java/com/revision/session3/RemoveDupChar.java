package com.revision.session3;

import java.util.Scanner;

public class RemoveDupChar {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String inputStr = scanner.nextLine();

        removeDupChar(inputStr);
    }
    private static void removeDupChar(String inputStr){
        String origStr = inputStr;
        char[] charArray = inputStr.toCharArray();
        String resStr = "";
        for(int i=0; i<charArray.length; i++){
            char character = inputStr.charAt(i);
            if(resStr.indexOf(character)==-1){
                resStr += character;
            }
        }
        System.out.println("Before removal of duplicates: "+origStr);
        System.out.println("After removal of duplicates: "+resStr);
    }
}
