package com.practiceSessions.session1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RemoveSubstring {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String inputStr = scanner.nextLine();

        System.out.println("Enter the sub-str:");
        String subStr = scanner.nextLine();

        //removerOfSubstr(inputStr, subStr);
        removerOfSubstr1(inputStr, subStr);
    }

    private static void removerOfSubstr1(String inputStr, String subStr) {
        String resultantString = inputStr.replaceAll("\\s*"+ Pattern.quote(subStr)+"\\s*", " ");
        System.out.println(resultantString.trim());
    }

    private static void removerOfSubstr(String inputStr, String subStr) {
        String resultantStr = "";

        for(String word: inputStr.split(subStr)){
            resultantStr = resultantStr+word;
        }
        System.out.println(resultantStr);
    }
}
