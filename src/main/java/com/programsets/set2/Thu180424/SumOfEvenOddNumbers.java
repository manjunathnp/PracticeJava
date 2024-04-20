package com.programsets.set2.Thu180424;

public class SumOfEvenOddNumbers {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};

        sumOfEvenOddDigits(num);
    }
    private static void sumOfEvenOddDigits(int[] num){
        int eSum = 0, oSum = 0;
        for(int i=0; i<num.length; i++){
            if(num[i]%2==0){
                eSum += num[i];
            }else {
                oSum += num[i];
            }
        }
        System.out.println("Even Sum: "+eSum);
        System.out.println("Odd Sum: "+oSum);
    }
}
