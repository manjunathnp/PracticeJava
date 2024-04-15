package com.revision.session1;

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the n1: ");
        int n1 = scanner.nextInt();
        System.out.println("Enter the n2: ");
        int n2 = scanner.nextInt();
        System.out.println("Enter the n3: ");
        int n3 = scanner.nextInt();

        largestOfThree(n1, n2, n3);
    }
    private static void largestOfThree(int n1, int n2, int n3){
        int large = n1>n2?n1:n2;
        int largest = n3>large?n3:large;

        System.out.println("Largest: "+largest);
    }
}
