package com.programsets.set1.Mon220424;

public class SumOfDigits {
    public static void main(String[] args) {
        int num = 123;

        int sum=0;
        while (num!=0){
            int rem = num%10;
            sum += rem;
            num = num/10;
        }
        System.out.println("Sum: "+sum);
    }
}
