package com.practiceSessions.general;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RemoveSubstr1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String inputStr = scanner.nextLine();

        System.out.println("Enter the sub-string: ");
        String subStr = scanner.nextLine();

        //String resultantStr = removeSubStr(inputStr, subStr);
        String resultantStr = removeSubStr1(inputStr, subStr);
        System.out.println("After removal of Sub-string: \n" + resultantStr);
    }

    private static String removeSubStr1(String inputStr, String subStr){
        return inputStr.replaceAll("\\s*"+ Pattern.quote(subStr) +"\\s*", " ");
    }

    private static String removeSubStr(String inputStr, String subStr){
        StringBuilder resStr = new StringBuilder();

        for(String word: inputStr.split(subStr)){
            resStr.append(word);
        }

        return new String(resStr).trim();
    }
}
