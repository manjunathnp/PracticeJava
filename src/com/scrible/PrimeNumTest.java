package com.scrible;

import java.util.Scanner;

public class PrimeNumTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();

        checkForPrimeNum(num);
    }

    private static void checkForPrimeNum(int num) {
        int count=0;
        if(num>0){
            for (int i=1; i<=num; i++){
                if(num%i == 0){
                    count++;
                }
            }
            if(count==2) System.out.println(num +" is PRIME NUMBER");
            else System.out.println(num+" is NOT PRIME NUMBER");

        }else{
            System.out.println("Invalid Input");
        }
    }

}
