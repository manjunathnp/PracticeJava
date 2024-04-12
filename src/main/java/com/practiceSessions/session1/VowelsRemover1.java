package com.practiceSessions.session1;

import java.util.Scanner;
import java.util.Set;

public class VowelsRemover1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String inputStr = scanner.nextLine();

        removeVowels(inputStr);
    }
    private static void removeVowels(String inputStr){
        Set<Character> vowels = Set.of('a', 'e', 'i','o', 'u', 'A', 'E', 'I','O', 'U');
        StringBuilder sbl = new StringBuilder();
        for(char ch: inputStr.toCharArray()){
            if(!vowels.contains(ch)){
                sbl.append(ch);
            }
        }
        System.out.println(new String(sbl).trim());
    }
}
