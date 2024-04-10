package com.practiceSessions.general;

import java.util.Scanner;

public class SimpleCalci {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your Selection:\n" +
                            "1. Addition" +
                            "\n2. Subtaction" +
                            "\n3. Multiplication" +
                            "\n4. Division");
        int selection = scanner.nextInt();
        while (selection >4 || selection<1){
            System.out.println("Invalid Selection - Retry!");
            System.out.println("Enter your Selection:\n" +
                    "1. Addition" +
                    "\n2. Subtaction" +
                    "\n3. Multiplication" +
                    "\n4. Division");
            selection = scanner.nextInt();
        }

        System.out.println("Enter the number 1");
        int num1 = scanner.nextInt();
        System.out.println("Enter the number 2");
        int num2 = scanner.nextInt();

        calculate(selection, num1, num2);
    }

    private static void calculate(int selection, int num1, int num2){
        switch (selection){
            case 1:
                int addRes = num1+num2;
                System.out.println("Addition Result: "+addRes);
                break;
            case 2:
                int subRes = num1-num2;
                System.out.println("Subtraction Result: "+subRes);
                break;
            case 3:
                int multRes = num1*num2;
                System.out.println("Multiplication Result: "+multRes);
                break;
            case 4:
                int divRes = num1/num2;
                System.out.println("Division Result: "+divRes);
                break;
            default:
                System.out.println("Retry!");
        }
    }
}
