package com.practiceSessions.session1;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your selection to add two numbers: " +
                            "\n1.Addition \n2.Subtraction \n3.Multiplication \n4.Division");
        System.out.print("\nSelection: ");
        int selection = scanner.nextInt();

        while (selection < 1 || selection > 4){
            System.out.println("Invalid Selection. Retry!");
            System.out.println("Enter your selection to add two numbers: " +
                    "\n1.Addition \n2.Subtraction \n3.Multiplication \n4.Division");
            selection = scanner.nextInt();
        }

        System.out.print("\nEnter two number: \nnum1 = ");
        int n1 = scanner.nextInt();
        System.out.print("num2 = ");
        int n2 = scanner.nextInt();

        simpleCalculatorDemo(selection, n1, n2);
    }

    private static void simpleCalculatorDemo(int selection, int n1, int n2) throws Exception {
            switch (selection){
                case 1:
                    int addRes = n1+n2;
                    System.out.println("Addition of "+n1+" + "+n2+" = "+addRes);
                    break;

                case 2:
                    int subRes = n1-n2;
                    System.out.println("Subraction of "+n1+" - "+n2+" = "+subRes);
                    break;

                case 3:
                    int mulRes = n1*n2;
                    System.out.println("Subraction of "+n1+" x "+n2+" = "+mulRes);
                    break;

                case 4:
                    if(n2==0)
                        throw new Exception("Division by Zero not allowed");
                    int divRes = n1/n2;
                    System.out.println("Subraction of "+n1+" / "+n2+" = "+divRes);
                    break;
        }

    }
}
