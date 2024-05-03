package com.programsets.set2.Thu250424;

import java.util.Scanner;

public class LargestOfNNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the total numbers: ");
        int n = scanner.nextInt();

        int[] a = new int[n];
        System.out.println("Enter the numbers: ");
        for(int i=0; i<n; i++){
            a[i] = scanner.nextInt();
        }
        largestNumber(a);
    }
    private static void largestNumber(int[] a){
        int max = a[0];
        for(int i=0; i<a.length; i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        System.out.println("Largest: "+max);
    }
}
