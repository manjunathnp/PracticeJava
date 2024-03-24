package com.misc;

import java.util.Random;

public class Session3 {
    public static void main(String[] args) {
        String numerics = "0123456789";

        int strLen = 6;
        StringBuilder sbl = new StringBuilder();
        Random random = new Random();

        for(int i=0; i<strLen; i++){
            char ch = numerics.charAt(random.nextInt(numerics.length()));
            sbl.append(ch);
        }

        System.out.println("OTP: "+sbl.toString());
    }
}
