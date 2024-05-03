package com.programsets.set1.Mon220424;

import java.util.Random;

public class RandomColor {
    public static void main(String[] args) {
        String[] colors = {"green", "blue", "yellow", "red"};
        Random random=new Random();
        System.out.println("Random Color:\n"+colors[random.nextInt(colors.length)]);
    }
}
