package com.stringpgms;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Input String 1: ");
        String inputStr1 = sc.nextLine();

        System.out.println("Enter the Input String 2: ");
        String inputStr2 = sc.nextLine();

        anagramCheck(inputStr1, inputStr2);
    }

    private static void anagramCheck(String inputStr1, String inputStr2) {
        String str1 = inputStr1.toLowerCase();
        String str2 = inputStr2.toLowerCase();

        if(inputStr1.length() == inputStr2.length()){
            char[] chStr1 = str1.toCharArray();
            char[] chStr2 = str2.toCharArray();

            Arrays.sort(chStr1);
            Arrays.sort(chStr2);

            boolean anagramResult = Arrays.equals(chStr1, chStr2);

            if(anagramResult==true){
                System.out.println("Strings are ANAGRAM");
            }else{
                System.out.println("String are NOT ANAGRAM");
            }

        }else{
            System.out.println("NOT ANAGRAM");
        }
    }
}
