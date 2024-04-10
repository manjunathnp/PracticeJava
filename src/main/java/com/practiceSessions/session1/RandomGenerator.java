package com.practiceSessions.session1;

import java.util.Random;

public class RandomGenerator {
    public static void main(String[] args) {
        String numerics = "0123456789";

        StringBuilder stringBuilder=new StringBuilder();
        Random random=new Random();
        int otpLen = 5;
        for(int i=0; i<otpLen; i++){
            int index = random.nextInt(numerics.length());
            char ch = numerics.charAt(index);
            stringBuilder.append(ch);
        }
        System.out.println("OTP: "+stringBuilder.toString());
    }
}
