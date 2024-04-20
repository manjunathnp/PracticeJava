package com.programsets.set2.Thu180424;

public class CountOfEvenOddDigits {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};

        countOfEvenOddDigits(num);
    }
    private static void countOfEvenOddDigits(int[] num){
        int evenCounter=0, oddCounter=0;
        for(int i=0; i<num.length; i++){
            if(num[i]%2==0){
                evenCounter++;
            }else {
                oddCounter++;
            }
        }
        System.out.println("Total Even Numbers: "+evenCounter);
        System.out.println("Total Odd Numbers: "+oddCounter);
    }
}
