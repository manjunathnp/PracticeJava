package com.scrible;

import java.util.Random;

public class RandomColorGenerator {
    public static void main(String[] args) {
        Random random=new Random();
        String[] colors = {"BLUE", "GREEN", "RED", "YELLOW"};

        System.out.println(colors[random.nextInt(colors.length)]);
    }
}
