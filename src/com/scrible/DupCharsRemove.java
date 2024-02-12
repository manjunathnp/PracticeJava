package com.scrible;

import java.util.Scanner;

public class DupCharsRemove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String inputStr = scanner.nextLine();

        String result=removeDuplicatesStr(inputStr);
        System.out.println("After removal of duplicates: "+result);
    }

    private static String removeDuplicatesStr(String inputStr) {
        String resultantStr = "";

        for(int i=0; i<inputStr.length(); i++){
            char c = inputStr.charAt(i);
            if(resultantStr.indexOf(c)==-1){
                resultantStr = resultantStr+c;
            }
        }
        return resultantStr;
    }
}
