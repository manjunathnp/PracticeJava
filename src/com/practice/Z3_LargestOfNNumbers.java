package com.practice;

import java.util.Scanner;

public class Z3_LargestOfNNumbers {
    static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        maxNumber(n);

    }

    private static void maxNumber(int n) {
        int[] a = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        int max = a[0];
        for(int i=0; i<n; i++){
            if(max<a[i])
                max=a[i];
        }
        System.out.println("Max number: "+max);
    }
}
