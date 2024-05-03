package com.programsets.set1.Mon220424.redo;

import java.util.Random;

public class RandomString {
    public static void main(String[] args) {
        int strLen=5;
        Random random=new Random();
        StringBuilder resStr = new StringBuilder();

        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        for(int i=0; i<strLen; i++){
            int index = random.nextInt(alphabets.length());
            resStr.append(alphabets.charAt(index));
        }
        System.out.println(resStr);
    }
}
