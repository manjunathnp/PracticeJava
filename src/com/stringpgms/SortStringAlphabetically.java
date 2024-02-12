package com.stringpgms;

import java.util.Arrays;
import java.util.Scanner;

public class SortStringAlphabetically {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String inputStr = sc.nextLine();

        sortInputStrUsingBuiltInMethod(inputStr);
        sortInputStr(inputStr);
    }

    private static void sortInputStrUsingBuiltInMethod(String inputStr) {
        char[] ch = inputStr.toCharArray();
        Arrays.sort(ch);

        String resultantStr = new String(ch);
        System.out.println("After sorting(using built-in method): "+resultantStr.trim());
    }

    private static void sortInputStr(String inputStr){
        char[] charArray = inputStr.toCharArray();

        for (int i = 0; i < charArray.length - 1; i++) {
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] > charArray[j]) {
                    char temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = temp;
                }
            }
        }


        String sortedString = new String(charArray);
        System.out.println("Sorted string: " + sortedString.trim());
    }

}
