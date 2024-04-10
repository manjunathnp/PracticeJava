package com.practiceSessions.general;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();

        primeNumberCheck(number);
    }

    private static void primeNumberCheck(int number) {
        int count=0;
        if(number > 0){
            for(int i=1; i<=number; i++){
                if(number%i == 0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(number+" is a Prime Number");
            }else{
                System.out.println(number+" is NOT a Prime Number");
            }


        }else{
            System.out.println("Invalid number");
        }
    }
}
