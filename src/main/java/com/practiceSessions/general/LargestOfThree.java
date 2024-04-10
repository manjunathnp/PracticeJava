package com.practiceSessions.general;

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the num1: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the num2: ");
        int num2 = scanner.nextInt();
        System.out.println("Enter the num3: ");
        int num3 = scanner.nextInt();

        largestNumber(num1, num2, num3);
    }

    private static void largestNumber(int num1, int num2, int num3) {
        int large = num1 > num2 ? num1:num2;
        int largest = num3 > large ? num3:large;

        System.out.println("Largest of three numbers: "+largest);
    }

}
