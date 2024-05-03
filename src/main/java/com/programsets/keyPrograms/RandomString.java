package com.programsets.keyPrograms;

import java.util.Random;

public class RandomString {
    public static void main(String[] args) {
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        Random random=new Random();
        StringBuilder resStr = new StringBuilder();
        int strlen = 5;


        for(int i=0; i<strlen; i++){
            int index = random.nextInt(alphabets.length());
            resStr.append(alphabets.charAt(index));
        }
        System.out.println(resStr);
    }
}
