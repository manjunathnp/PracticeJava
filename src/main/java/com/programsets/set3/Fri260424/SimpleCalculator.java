package com.programsets.set3.Fri260424;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("1. Addition \n2. Subtraction \n3. Multiplication \n4. Division \nEnter your selection: ");
        int selection = scanner.nextInt();

        while(selection>4 || selection <=0){
            System.out.println("Invalid selection. Retry!");
            selection=scanner.nextInt();
        }

        System.out.println("Enter the number1: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the number2: ");
        int num2 = scanner.nextInt();

        calculator(selection, num1, num2);
    }
    private static void calculator(int selection, int n1, int n2){
        switch (selection){
            case 1:
                int addRes = n1+n2;
                System.out.println("Addition Result: "+addRes);
                break;

            case 2:
                int subRes = n1-n2;
                System.out.println("Subtraction Result: "+subRes);
                break;

            case 3:
                int mulRes = n1*n2;
                System.out.println("Addition Result: "+mulRes);
                break;

            case 4:
                if(n2==0){
                    System.out.println("Invalid - Division By Zero Not Allowed");
                    break;
                }else {
                    int divRes = n1/n2;
                    System.out.println("Addition Result: "+divRes);
                    break;
                }

            default:
                System.out.println("Invalid Operation");
                break;

        }
    }
}
