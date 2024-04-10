package com.practiceSessions.session2;

import java.util.Random;

public class RandomGenerator {
    public static void main(String[] args) {
        String alphas = "abcdefghijklmnopqrstuvwxyz";

        StringBuilder alphaOTP = new StringBuilder();
        Random random=new Random();
        int otpLen = 5;
        for(int i=0; i<otpLen; i++){
            int index = random.nextInt(alphas.length());
            char ch = alphas.charAt(index);
            alphaOTP.append(ch);
        }

        System.out.println("OTP: "+alphaOTP.toString());
    }
}
