package com.revision.session1;

import java.util.Scanner;

public class DigitsCounter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");
        long number = scanner.nextInt();

        digitsCounter(number);
    }
    private static void digitsCounter(long number){
        int counter=0;
        while (number!=0){
            number = number/10;
            counter++;
        }
        System.out.println("Totat digits: "+counter);
    }
}
