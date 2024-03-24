package com.scrible;

import java.util.Scanner;

public class RemoveSpecificChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input str: ");
        String inputStr = sc.nextLine();

        System.out.println("Enter the character to be removed: ");
        char ch = sc.next().charAt(0);

        String resultantStr = inputStr.replaceAll(String.valueOf(ch), "");
        System.out.println(resultantStr);
    }
}
