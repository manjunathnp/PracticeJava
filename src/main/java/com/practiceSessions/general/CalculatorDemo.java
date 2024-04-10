package com.practiceSessions.general;

import java.util.Scanner;

public class CalculatorDemo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your selection:\n 1.Addition\n 2.Subtraction\n 3.Division\n 4.Multiplication");
        int selection = scanner.nextInt();
        while(selection > 5 || selection < 1){
            System.out.println("Invalid Selection, Retry!");
            selection = scanner.nextInt();
        }
        System.out.println("Enter the number1: ");
        int n1 = scanner.nextInt();
        System.out.println("Enter the number2: ");
        int n2 = scanner.nextInt();

        calculatorDemo(selection, n1, n2);
    }

    private static void calculatorDemo(int selection, int n1, int n2) {
        switch (selection){
            case 1:
                int addRes = n1+n2;
                System.out.println("Addition result: "+addRes);
                break;

            case 2:
                int subRes = n1-n2;
                System.out.println("Addition result: "+subRes);
                break;

            case 3:
                if(n2==0){
                    System.out.println("Division by ZERO not allowed!");
                    break;
                }else{
                    int divRes = n1/n2;
                    System.out.println("Addition result: "+divRes);
                    break;
                }


            case 4:
                int mulRes = n1*n2;
                System.out.println("Addition result: "+mulRes);
                break;
        }
    }
}
