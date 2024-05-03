package com.programsets.set2.Thu250424;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random random=new Random();

        System.out.println("Random Integer: "+random.nextInt());
        System.out.println("Random Double: "+random.nextDouble());
        System.out.println("Random Float: "+random.nextFloat());
        System.out.println("Random Boolean: "+random.nextBoolean());
    }
}
