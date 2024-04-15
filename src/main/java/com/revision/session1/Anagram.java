package com.revision.session1;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string 1: ");
        String str1 = scanner.nextLine();
        System.out.println("Enter the string 2: ");
        String str2 = scanner.nextLine();

        anagramCheck(str1, str2);

    }
    private static void anagramCheck(String str1, String str2){
        char[] s1 = str1.toLowerCase().toCharArray();
        char[] s2 = str2.toLowerCase().toCharArray();

        if(s1.length==s2.length){
            Arrays.sort(s1);
            Arrays.sort(s2);

            boolean isAnagram = Arrays.equals(s1, s2);
            if(isAnagram){
                System.out.println("ANAGRAM");
            }else {
                System.out.println("NOT ANAGRAM");
            }
        }else {
            System.out.println("NOT ANAGRAM");
        }
    }
}
