package com.stringpgms;

import java.util.Scanner;

public class SubStrIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String inputStr = sc.nextLine();

        System.out.println("Enter the sub-string: ");
        String subString = sc.nextLine();
        SubStringIndex(inputStr, subString);
    }

    private static void SubStringIndex(String inputStr, String subString) {
        System.out.println("Substring index of : \n"+subString+" >> "+inputStr.indexOf(subString));

    }
}
