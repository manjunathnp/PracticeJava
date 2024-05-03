package com.programsets.set2.Thu250424;

public class SumEvenOddDigits {
    public static void main(String[] args) {
        int[] numbers = {20, 21, 22, 23, 24, 25, 27, 30, 32};
        int eSum = 0, oSum = 0;

        for(int i=0; i<numbers.length; i++){
            if(numbers[i]%2==0){
                eSum += numbers[i];
            }else {
                oSum += numbers[i];
            }
        }
        System.out.println("Even Sum: "+eSum);
        System.out.println("Odd Sum: "+oSum);
    }
}
