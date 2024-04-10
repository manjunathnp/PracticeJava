package com.practiceSessions.stringPract;/*
package com.practiceSessions.stringPract;

import java.util.Scanner;

public class RemoveSubStr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String inputStr = scanner.nextLine();

        System.out.println("Enter the sub-string: ");
        String subStr = scanner.nextLine();

        String resultantStr = removeSubStr(inputStr, subStr);
        System.out.println("After removal of Sub-string: \n" + resultantStr);
    }

    private static String removeSubStr(String inputStr, String subStr) {
        String[] words = inputStr.split(subStr);
        StringBuilder sbl = new StringBuilder();
        for(String word: words){
            sbl.append(word);
        }
        return new String(sbl);
    }
}
*/

import java.util.Scanner;
import java.util.regex.Pattern;

public class RemoveSubStr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String inputStr = scanner.nextLine();

        System.out.println("Enter the sub-string: ");
        String subStr = scanner.nextLine();

        String resultantStr = removeSubStr(inputStr, subStr);
        System.out.println("After removal of Sub-string: \n" + resultantStr);
    }

    private static String removeSubStr(String inputStr, String subStr) {
        // Pattern.quote() is used to treat the subStr as a literal string and escape any special characters
        // The regex \s* allows for matching zero or more spaces around the substring to be removed
        return inputStr.replaceAll("\\s*" + Pattern.quote(subStr) + "\\s*", " ").trim();
    }
}
