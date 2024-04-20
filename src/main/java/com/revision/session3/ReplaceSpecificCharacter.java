package com.revision.session3;

import java.util.Scanner;

public class ReplaceSpecificCharacter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the input string: ");
        String inputStr = scanner.nextLine();
        System.out.println("Enter the character to replace: ");
        char charToReplace = scanner.next().charAt(0);
        System.out.println("Enter the replacement character: ");
        char replacementChar = scanner.next().charAt(0);

        replaceSpecificCharacter(inputStr, charToReplace, replacementChar);
    }
    private static void replaceSpecificCharacter(String inputStr, char charToReplace, char replacementChar){
        String resStr = "";
        char[] charArray = inputStr.toCharArray();

        for(int i=0; i<charArray.length; i++){
            if(charArray[i]==charToReplace){
                charArray[i]=replacementChar;
            }
        }
        System.out.println("Resultant string: "+new String(charArray));
    }
}
