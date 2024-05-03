package com.programsets.set2.Thu250424;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "point";
        String str2 = "oint";

        if(str1.length()==str2.length()){
            char[] charArray1=str1.toLowerCase().toCharArray();
            char[] charArray2=str2.toLowerCase().toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            boolean isAnagram = Arrays.equals(charArray1, charArray2);
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
