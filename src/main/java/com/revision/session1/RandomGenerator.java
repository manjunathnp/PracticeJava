package com.revision.session1;

import java.util.Random;

public class RandomGenerator {
    public static void main(String[] args) {
        Random random=new Random();
        System.out.println("Random Integer: "+random.nextInt());
        System.out.println("Random Double: "+random.nextDouble());
        System.out.println("Random Boolean: "+random.nextBoolean());
        System.out.println("Random Float: "+random.nextFloat());
    }
}
