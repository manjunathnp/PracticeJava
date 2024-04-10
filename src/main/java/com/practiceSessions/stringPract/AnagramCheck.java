package com.practiceSessions.stringPract;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the String 1: ");
        String str1 = scanner.nextLine();

        System.out.println("Enter the String 2: ");
        String str2 = scanner.nextLine();

        anagramCheck(str1, str2);
    }

    private static void anagramCheck(String str1, String str2){
        if(str1.length()==str2.length()){
            char[] charArray1=str1.toLowerCase().toCharArray();
            char[] charArray2=str2.toLowerCase().toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            boolean isAnagram=Arrays.equals(charArray1, charArray2);
            if(isAnagram){
                System.out.println("ANAGRAM");
            }else {
                System.out.println("NOT ANAGRAM");
            }

        }else{
            System.out.println("NOT ANAGRAM");
        }
    }
}
