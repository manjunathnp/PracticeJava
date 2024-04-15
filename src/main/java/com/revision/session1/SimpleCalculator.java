package com.revision.session1;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Select the Arithmetic Operation: \n1.Addition\n2.Subtraction\n3.Division\n4.Multiplication");
        int selection = scanner.nextInt();

        while (selection<=0 || selection>5){
            System.out.println("Invalid option selected, retry!");
            selection = scanner.nextInt();
        }

        System.out.println("Enter the numeric1: ");
        double n1 = scanner.nextDouble();
        System.out.println("Enter the numeric2: ");
        double n2 = scanner.nextDouble();

        calculator(selection, n1, n2);
    }
    private static void calculator(int selection, double n1, double n2){
        switch (selection){
            case 1:
                double addRes = n1+n2;
                System.out.println("Addition Result: "+addRes);
                break;

            case 2:
                double subRes = n1-n2;
                System.out.println("Subtraction Result: "+subRes);
                break;

            case 3:
                if(n2==0){
                    System.out.println("Invalid input - division by zero!");
                    break;
                }else{
                    double divRes = n1/n2;
                    System.out.println("Division Result: "+divRes);
                    break;
                }

            case 4:
                double mulRes = n1*n2;
                System.out.println("Multiplication Result: "+mulRes);
                break;

        }
    }
}
