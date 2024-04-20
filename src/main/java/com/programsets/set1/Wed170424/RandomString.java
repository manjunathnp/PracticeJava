package com.programsets.set1.Wed170424;

import java.util.Random;

public class RandomString {
    public static void main(String[] args) {
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        int length = 5;
        Random random=new Random();
        StringBuilder resStr = new StringBuilder();


        for(int i=0; i<length; i++){
            int index = random.nextInt(alphabets.length());
            resStr.append(alphabets.charAt(index));
        }
        System.out.println("Random String: "+resStr);
    }
}
