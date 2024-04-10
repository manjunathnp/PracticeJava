package com.practiceSessions.session1;

import java.util.Scanner;
import java.util.regex.Pattern;


public class SubStrRemover {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String inputStr = scanner.nextLine();

        System.out.println("Enter the sub-string: ");
        String subStr = scanner.nextLine();

        String resultantStr = removeSubStr(inputStr, subStr);
        System.out.println("After removal of Sub-string: \n" + resultantStr);
    }
    private static String removeSubStr(String inputStr, String subStr){
        //logic-1
        /*String[] words = inputStr.split(subStr);
        String resStr = "";
        for(String word: words){
            resStr += word;
        }
        return resStr.trim();*/

        //logic-2*
        String resStr = inputStr.replaceAll("\\s*"+ Pattern.quote(subStr)+"\\s*", " ").trim();
        return resStr;
    }
}
