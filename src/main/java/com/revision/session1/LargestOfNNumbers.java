package com.revision.session1;

import java.util.Scanner;

public class LargestOfNNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the total no. of numbers: ");
        int size = scanner.nextInt();
        int[] a = new int[size];

        System.out.println("Enter the numbers: ");
        for(int i=0; i<a.length; i++){
            a[i]=scanner.nextInt();
        }

        largestOfNNumbers(a);
    }

    private static void largestOfNNumbers(int[] a){
        int max = a[0];
        for(int i=0; i<a.length; i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("Largest: "+max);
    }
}
