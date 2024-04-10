package com.practiceSessions.general;

import java.util.Scanner;

public class LargestOfN {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the total elements size: ");
        int size = scanner.nextInt();

        int[] a = new int[size];
        System.out.println("Enter the elements: ");
        for(int i=0; i<size; i++){
            a[i] = scanner.nextInt();
        }

        largestNumber(a);
    }
    private static void largestNumber(int[] a){
        int max = a[0];
        for(int i=0; i<a.length; i++){
            if(a[i]>max)
                a[i]=max;
        }
        System.out.println("Largest Number: "+max);
    }
}
