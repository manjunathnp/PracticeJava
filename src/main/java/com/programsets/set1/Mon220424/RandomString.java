package com.programsets.set1.Mon220424;

import java.util.Random;

public class RandomString {
    public static void main(String[] args) {
        int strLen = 6;
        Random random=new Random();
        StringBuilder resStr = new StringBuilder();

        String alphas = "abcdefghijklmnopqrstuvwxyz";
        for(int i=0; i<strLen; i++){
            int index = random.nextInt(alphas.length());
            resStr.append(alphas.charAt(index));
        }
        System.out.println(resStr);
    }
}
