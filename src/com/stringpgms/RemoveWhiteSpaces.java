package com.stringpgms;

import java.util.Scanner;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String inputStr = sc.nextLine();

        removeWhiteSpacesUsingBuiltInMethod(inputStr);
        removeWhiteSpaces(inputStr);
    }

    private static void removeWhiteSpaces(String inputStr) {
        System.out.println("String after removal of white spaces using built-in method: "+
                inputStr.replaceAll("\\\\s", ""));
    }

    private static void removeWhiteSpacesUsingBuiltInMethod(String inputStr) {
        String resultantStr = "";
        char[] ch = inputStr.toCharArray();
        for(int i=0; i<inputStr.length(); i++){
            if(ch[i] != ' ' && ch[i] != '\t' && ch[i] != '\n'){
                resultantStr += inputStr.charAt(i);
            }
        }
        System.out.println("String after removal of white spaces: "+resultantStr);
    }
}
