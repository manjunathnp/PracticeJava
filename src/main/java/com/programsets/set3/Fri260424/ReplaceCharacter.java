package com.programsets.set3.Fri260424;

public class ReplaceCharacter {
    public static void main(String[] args) {
        String inputStr = "tester is testing";
        char characterToReplace = 't';
        char replacementChar = 'b';

        StringBuilder resStr=new StringBuilder();
        for(char character: inputStr.toCharArray()){
            if(character==characterToReplace){
                resStr.append(replacementChar);
            }else {
                resStr.append(character);
            }
        }
        System.out.println("After replacement: "+resStr.toString());
    }
}
