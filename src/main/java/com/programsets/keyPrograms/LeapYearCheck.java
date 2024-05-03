package com.programsets.keyPrograms;

import java.time.Year;

public class LeapYearCheck {
    public static void main(String[] args) {
        int year = 2003;

        if(year%400==0 && year%100!=0 || year%4==0){
            System.out.println(year+ " = LEAP YEAR");
        }else {
            System.out.println(year +" = NOT LEAP YEAR");
        }
    }
}
