package com.scrible;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String inputStr = sc.nextLine();

        System.out.println("Enter the sub-string: ");
        String subStr = sc.nextLine();

        indexPosOfSubstr(inputStr,subStr);

    }

    private static void indexPosOfSubstr(String inputStr, String subStr) {
        System.out.println("Index of "+subStr+" : "+inputStr.indexOf(subStr));
    }


}
