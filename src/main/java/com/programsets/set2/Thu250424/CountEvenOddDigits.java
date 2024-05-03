package com.programsets.set2.Thu250424;

public class CountEvenOddDigits {
    public static void main(String[] args) {
        int[] numbers = {20, 21, 22, 23, 24, 25, 27, 30, 32};
        int evenCount = 0;
        int oddCount = 0;

        for(int i=0; i<numbers.length; i++){
            if(numbers[i]%2 == 0){
                evenCount++;
            }else {
                oddCount++;
            }
        }
        System.out.println("Even count: "+evenCount);
        System.out.println("Odd Count: "+oddCount);
    }
}
