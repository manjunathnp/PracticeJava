package com.practiceSessions.general;

import java.time.Year;
import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Year: ");
        int year = scanner.nextInt();

        checkLeapYear(year);
    }

    private static void checkLeapYear(int year) {
        if(year%400 == 0 || year%4==0 & year%100 !=0 ){
            System.out.println(year+" = is LEAP YEAR");
        }else {
            System.out.println(year+" = is NOT LEAP YEAR");
        }
    }
}
