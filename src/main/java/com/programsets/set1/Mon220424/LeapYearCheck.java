package com.programsets.set1.Mon220424;

public class LeapYearCheck {
    public static void main(String[] args) {
        int year = 2024;

        if(year%400==0 && year%100!=0 || year%4==0){
            System.out.println("LEAP YEAR");
        }else {
            System.out.println("NOT LEAP YEAR");
        }
    }
}
