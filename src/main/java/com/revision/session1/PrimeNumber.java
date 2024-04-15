package com.revision.session1;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();

        primeNumberCheck(num);
    }
    private static void primeNumberCheck(int num){
        if(num > 0){
            int counter=0;
            for(int i=1; i<=num; i++){
                if(num%i==0){
                    counter++;
                }
            }
            if(counter==2){
                System.out.println("PRIME NUMBER");
            }else{
                System.out.println("NON-PRIME NUMBER");
            }

        }else{
            System.out.println("Invalid number! Retry!");
        }
    }
}
