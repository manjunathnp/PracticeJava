package com.revision.session1;

import java.util.Scanner;

public class Swapper {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number1: ");
        int n1 = scanner.nextInt();
        System.out.println("Enter the number2: ");
        int n2 = scanner.nextInt();

        swapper(n1, n2);
    }
    private static void swapper(int n1, int n2){
        System.out.println("Before Swap: "+n1+" | "+n2);
        //Logic-1
        /*int temp = n1;
        n1 = n2;
        n2 = temp;*/

        //Logic-2
        /*n1 = n1+n2;
        n2 = n1-n2;
        n1 = n1-n2;*/

        //Logic-3
        n1 = n1*n2;
        n2 = n1/n2;
        n1 = n1/n2;

        System.out.println("After Swap: "+n1+" | "+n2);
    }
}
