package com.programsets.kppract1;

public class LeapYearCheck {
    public static void main(String[] args) {
        int year=2013;

        if(year%4==0 || year%100!=0 && year%400==0){
            System.out.println("Leap Year");
        }else {
            System.out.println("NOT LEAP YEAR");
        }
    }
}
