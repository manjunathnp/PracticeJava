package com.programsets.set2.Thu250424;

public class ArraySum {
    public static void main(String[] args) {
        int[] numbers = {20, 21, 22, 23, 24, 25, 27, 30, 32};
        int sum = 0;

        for(int i=0; i<numbers.length; i++){
            sum += numbers[i];
        }
        System.out.println("Sum: "+sum);
    }
}
