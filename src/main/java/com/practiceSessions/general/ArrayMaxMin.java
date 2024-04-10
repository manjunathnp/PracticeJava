package com.practiceSessions.general;

import java.util.Scanner;

public class ArrayMaxMin {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int size = scanner.nextInt();

        int[] a = new int[size];
        System.out.println("Enter the array elements: ");
        for(int i=0; i<a.length; i++){
            a[i] = scanner.nextInt();
        }
        maxMinFinder(a);
    }

    private static void maxMinFinder(int[] a) {
        int max = a[0];
        int min = a[0];

        for(int i=0; i<a.length; i++){
            if(a[i]>max){
                max = a[i];
            }

            if(a[i]<min){
                min = a[i];
            }
        }
        System.out.println("Max value: "+max);
        System.out.println("Min value: "+min);
    }
}
