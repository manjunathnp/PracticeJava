package com.practiceSessions.session2;

import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number1: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the number2: ");
        int num2 = scanner.nextInt();

        System.out.println("Enter the number3: ");
        int num3 = scanner.nextInt();

        largestOfThree(num1, num2, num3);

    }

    private static void largestOfThree(int n1, int n2, int n3){
        int large = n1>n2 ? n1:n2;
        int largest = n3>large ? n3:large;

        System.out.println("Largest: "+largest);
    }
}
