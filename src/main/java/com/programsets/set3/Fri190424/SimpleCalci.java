package com.programsets.set3.Fri190424;

import java.util.Scanner;

public class SimpleCalci {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the arithmetic operation to perform on two numbers: \n" +
                "1. Addition\n2. Subtraction\n3. Division\n4. Multiplication");
        int selection = scanner.nextInt();

        while (selection > 4 || selection <= 0){
            System.out.println("Invalid selection. Retry!");
            selection = scanner.nextInt();
        }

        System.out.println("Enter the number_1: ");
        int n1 = scanner.nextInt();
        System.out.println("Enter the number_2: ");
        int n2 = scanner.nextInt();

        calculate(selection, n1, n2);
    }
    private static void calculate(int selection, int n1, int n2){
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
                if(n2==0){
                    System.out.println("Division by zero not allowed");
                    break;
                }
                int divRes = n1/n2;
                System.out.println("Division Result: "+divRes);
                break;

            case 4:
                int mulRes = n1*n2;
                System.out.println("Multiplication Result: "+mulRes);
                break;

        }
    }
}
