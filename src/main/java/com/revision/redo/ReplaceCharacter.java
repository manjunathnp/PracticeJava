package com.revision.redo;

public class ReplaceCharacter {
    public static void main(String[] args) {
        String inputStr = "test automation";
        char charToReplace = 't';
        char replacementChar = 'b';

        replaceCharacter(inputStr, charToReplace, replacementChar);
    }
    private static void replaceCharacter(String inputStr, char charToReplace, char replacementChar){
        char[] charArray = inputStr.toCharArray();

        for(int i=0; i<charArray.length; i++){
            if(charArray[i]==charToReplace){
                charArray[i]=replacementChar;
            }
        }
        System.out.println("After replacement: "+new String(charArray));
    }
}
