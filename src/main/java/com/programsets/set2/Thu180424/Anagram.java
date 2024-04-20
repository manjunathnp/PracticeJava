package com.programsets.set2.Thu180424;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string1: ");
        String str1 = scanner.nextLine();
        System.out.println("Enter the string2: ");
        String str2 = scanner.nextLine();

        checkAnagram(str1, str2);
    }
    private static void checkAnagram(String str1, String str2){

        if(str1.length()==str2.length()){
            char[] charArray1 = str1.toLowerCase().toCharArray();
            char[] charArray2 = str2.toLowerCase().toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            boolean anagramStatus = Arrays.equals(charArray1, charArray2);
            if(anagramStatus){
                System.out.println("ANAGRAM");
            }else {
                System.out.println("NOT ANAGRAM");
            }
        }else{
            System.out.println("NOT ANAGRAM");
        }



    }
}
