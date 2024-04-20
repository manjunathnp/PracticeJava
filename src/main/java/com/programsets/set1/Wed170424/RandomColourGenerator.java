package com.programsets.set1.Wed170424;

import java.util.Random;
import java.util.Scanner;

public class RandomColourGenerator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the total number of colors: ");
        int totalColors = scanner.nextInt();

        String[] colors = new String[totalColors];
        System.out.println("Enter the colors: ");
        for(int i=0; i<colors.length; i++){
            colors[i] = scanner.next();
        }

        randomColorGenerator(colors);
    }
    private static void randomColorGenerator(String[] colors){
        Random random = new Random();
        int index = random.nextInt(colors.length);
        System.out.println("Random Color: "+colors[index]);
    }
}
