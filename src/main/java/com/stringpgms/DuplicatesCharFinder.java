package com.stringpgms;

import java.util.Scanner;

public class DuplicatesCharFinder {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the input string: ");
        String inputStr = scanner.nextLine();

        duplicatesCharFinder(inputStr);
    }

    private static void duplicatesCharFinder(String inputStr) {
        char[] charArray = inputStr.toLowerCase().toCharArray();

        boolean isDuplicate = false;

        System.out.println("Duplicates: ");
        for(int i=0; i<charArray.length; i++){
            for(int j=i+1; j<charArray.length; j++){
                if(charArray[i]==charArray[j]){
                    isDuplicate=true;
                    System.out.println(charArray[i]);
                    break;
                }
            }
        }
        if(isDuplicate==false)
            System.out.println("No Duplicates");
    }
}
