package com.revision.session1;

import java.util.Scanner;
import java.util.Set;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = scanner.nextLine();

        removeVowels(str);
    }
    private static void removeVowels(String str){
        char[] charArray=str.toCharArray();
        String resStr = "";
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        for(char character: charArray){
            if(!vowels.contains(character)){
                resStr += character;
            }
        }
        System.out.println("After removal of vowels: "+resStr);
    }
}
