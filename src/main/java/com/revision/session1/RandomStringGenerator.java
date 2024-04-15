package com.revision.session1;

import java.util.Random;
import java.util.Scanner;

public class RandomStringGenerator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the length of random string to generate: ");
        int strLen = scanner.nextInt();

        randomStrGenerator(strLen);
    }

    private static void randomStrGenerator(int strLen){
        String alphas = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random random=new Random();
        StringBuilder resStr = new StringBuilder();

        for(int i=0; i<strLen; i++){
            int index = random.nextInt(alphas.length());
            resStr.append(alphas.charAt(index));
        }
        System.out.println("Random String: "+new String(resStr));
    }
}
