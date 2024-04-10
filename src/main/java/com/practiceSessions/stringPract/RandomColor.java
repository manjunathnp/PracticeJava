package com.practiceSessions.stringPract;

import java.util.Random;

public class RandomColor {
    public static void main(String[] args) {
        String[] colors = {"Red", "Green", "Blue", "Yellow"};

        Random random = new Random();
        System.out.println("Random Color: "+colors[random.nextInt(colors.length)]);
    }
}
