package com.revision.session1;

import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = scanner.nextLine();

        stringToInteger(str);
    }

    private static void stringToInteger(String str){
        int numeric=Integer.parseInt(str);
        System.out.println("Converted String to Integer: "+numeric);
    }
}
