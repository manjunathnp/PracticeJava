package com.scrible;

import java.util.Scanner;

public class LargestOfNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number count: ");
        int size = sc.nextInt();

        int[] a = new int[size];
        System.out.println("Enter the elements: ");
        for(int i=0;i<size; i++ ){
            a[i] = sc.nextInt();
        }

        int max = a[0];
        for(int i=0; i<size; i++){
            if(max < a[i])
                max = a[i];
        }
        System.out.println("Max number: "+max);
    }
}
