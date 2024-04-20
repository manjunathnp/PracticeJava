package com.programsets.set2.Thu180424;

import java.util.Scanner;

public class LargestOfNNumbersDemo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the total number: ");
        int size = scanner.nextInt();

        int[] num = new int[size];
        System.out.println("Enter the numbers: ");
        for(int i=0; i<num.length; i++){
            num[i]=scanner.nextInt();
        }
        largestNumber(num);
    }
    private static void largestNumber(int[] num){
        int max=num[0];
        for(int i=0; i<num.length; i++){
            if(num[i]>max){
                max=num[i];
            }
        }
        System.out.println("Largest: "+max);
    }
}
