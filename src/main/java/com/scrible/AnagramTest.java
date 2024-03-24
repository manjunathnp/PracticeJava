package com.scrible;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string 1: ");
        String str1 = scanner.next();

        System.out.println("Enter the string 2: ");
        String str2 = scanner.next();

        checkForAnagram(str1, str2);
    }

    private static void checkForAnagram(String str1, String str2) {
        String s1 = str1.toLowerCase();
        String s2 = str2.toLowerCase();

        if(s1.length() == s2.length()){
            char[] c1 = s1.toCharArray();
            char[] c2 = s2.toCharArray();

            Arrays.sort(c1);
            Arrays.sort(c2);
            boolean res = Arrays.equals(c1, c2);

            if(res) System.out.println("ANAGRAM");
            else System.out.println("NOT ANAGRAM");

        }else {
            System.out.println("NOT ANAGRAM");
        }
    }

}
