package com.scrible;

import java.util.Scanner;

public class LargestOfThreeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter num1:");
        int num1 = scanner.nextInt();

        System.out.println("Enter num2:");
        int num2 = scanner.nextInt();

        System.out.println("Enter num3:");
        int num3 = scanner.nextInt();

        findLargestOfThreeNums(num1, num2, num3);

    }

    private static void findLargestOfThreeNums(int num1, int num2,int num3){
        int large = num1>num2 ? num1 : num2;
        int largest = num3>large ? num3 : large;

        System.out.println("Largest of Three: "+num1+" "+num2+" "+ num3+" \n"+"Largest = "+largest);
    }
}
