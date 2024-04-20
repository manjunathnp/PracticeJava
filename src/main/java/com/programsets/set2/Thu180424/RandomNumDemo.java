package com.programsets.set2.Thu180424;

import java.util.Random;

public class RandomNumDemo {
    public static void main(String[] args) {
        Random random=new Random();
        System.out.println("Random Integer: "+random.nextInt());
        System.out.println("Random Long: "+random.nextLong());
        System.out.println("Random Float: "+random.nextFloat());
        System.out.println("Random Double: "+random.nextDouble());
        System.out.println("Random Boolean: "+random.nextBoolean());
    }
}
