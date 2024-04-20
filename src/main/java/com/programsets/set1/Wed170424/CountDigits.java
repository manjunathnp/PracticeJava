package com.programsets.set1.Wed170424;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();

        countDigits(num);
    }
    private static void countDigits(int num){
        int counter=0;
        while (num != 0){
            num = num/10;
            counter++;
        }
        System.out.println("Total Digits: "+counter);
    }
}
