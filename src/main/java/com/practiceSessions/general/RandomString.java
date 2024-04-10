package com.practiceSessions.general;

import java.util.Random;

public class RandomString {
    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrstuvwxyz";

        Random random=new Random();
        StringBuilder randomString = new StringBuilder();
        int strLen = 10;

        for(int i=0; i<strLen; i++){
            int index = random.nextInt(strLen);
            char ch = str.charAt(index);
            randomString.append(ch);
        }
        System.out.println("Random String: "+randomString.toString());
        System.out.println("Random Email: "+randomString.toString()+"@testmail.com");
    }
}
