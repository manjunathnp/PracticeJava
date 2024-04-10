package com.practiceSessions.general;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int size = scanner.nextInt();

        int[] a = new int[size];
        System.out.println("Enter the array elements: ");
        for(int i=0; i<a.length; i++){
            a[i] = scanner.nextInt();
        }

        sumFinder(a);
    }
    private static void sumFinder(int[] a){
        int arraySum = 0;
        for(int i=0; i<a.length; i++){
            arraySum += a[i];
        }
        System.out.println("Array Sum: "+arraySum);
    }
}
