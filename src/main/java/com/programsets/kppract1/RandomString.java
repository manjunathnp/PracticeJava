package com.programsets.kppract1;

import java.util.Random;

public class RandomString {
    public static void main(String[] args) {
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        String numerics = "0123456789";
        Random random=new Random();
        StringBuilder randomAlphas = new StringBuilder();
        StringBuilder randomNumerics = new StringBuilder();

        int strLen = 5;
        for(int i=0; i<strLen; i++){
            int alphaIndex = random.nextInt(alphabets.length());
            int numIndex = random.nextInt(numerics.length());
            randomAlphas.append(alphabets.charAt(alphaIndex));
            randomNumerics.append(numerics.charAt(numIndex));
        }
        System.out.println("Random Alpha String: "+randomAlphas);
        System.out.println("Random Numeric String: "+randomNumerics);

    }
}
