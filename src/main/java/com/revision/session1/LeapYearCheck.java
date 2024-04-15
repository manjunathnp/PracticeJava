package com.revision.session1;

import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Year: ");
        int year = scanner.nextInt();

        leapYearCheck(year);
    }
    private static void leapYearCheck(int year){
        if(year%4==0 && year%100!=0|| year%400==0){
            System.out.println(year+" is Leap Year");
        }else {
            System.out.println(year+" is Not Leap Year");
        }
    }
}
