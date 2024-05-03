package com.programsets.set1.Mon220424.redo;

public class Fibonacci {
    public static void main(String[] args) {
        int num = 6;

        int n1=0, n2=1, sum=0;
        for(int i=1; i<=num; i++){
            System.out.print(n1+" ");
            sum = n1+n2;
            n1 = n2;
            n2 = sum;
        }
    }
}
