package com.practiceSessions.session2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RemoveSubStr {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the input string: ");
        String inputStr = scanner.nextLine();

        System.out.println("Enter the sub-string: ");
        String subStr = scanner.nextLine();

        removeSubStr(inputStr, subStr);
    }

    private static void removeSubStr(String inputStr, String subStr){
        //Logic-1
        /*String resStr = inputStr.replaceAll("\\s*"+ Pattern.quote(subStr) +"\\s*", " ").trim();
        System.out.println("Resultant String: "+resStr);*/

        //Logic-2
        String[] words = inputStr.split(subStr);
        String resStr = "";
        for(String word: words){
            resStr += word;
        }
        System.out.println("Resultant String: "+resStr);
    }
}
