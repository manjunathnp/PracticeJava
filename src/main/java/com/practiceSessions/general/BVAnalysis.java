package com.practiceSessions.general;

import java.util.Arrays;
import java.util.Scanner;

public class BVAnalysis {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the initial boundary value: ");
        int initialBV = scanner.nextInt();
        System.out.println("Enter the final boundary value: ");
        int finalBV = scanner.nextInt();

        bvAnalysis(initialBV, finalBV);
    }
    private static void bvAnalysis(int initialBV, int finalBV) {
        // 10 - 100 = 9, 10, 100, 101
        System.out.println("Boundary Value: ");
        int[] boundaryValue = {initialBV - 1, initialBV, finalBV, finalBV + 1};

        System.out.println(Arrays.toString(boundaryValue));
    }

}
