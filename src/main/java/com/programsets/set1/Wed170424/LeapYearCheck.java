package com.programsets.set1.Wed170424;

import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = scanner.nextInt();

        leapYearCheck(year);
    }
    private static void leapYearCheck(int year){
        if(year%400 == 0 && year%100!=0 || year%4==0){
            System.out.println(year+" is LEAP YEAR");
        }else {
            System.out.println(year+" is NOT LEAP YEAR");
        }
    }
}
