package com.misc;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        // Example array
        int[] numbers = {12, 5, 23, 54, 7, 32, 19};

        // Specify the value of 'n'
        int n = 3; // Change this to find the nth largest number

        int nthLargest = findNthLargest(numbers, n);

        System.out.println("The " + n + "th largest number is: " + nthLargest);

        countEvenOddDigits(numbers);
    }

    // Method to find the nth largest number in an array
    private static int findNthLargest(int[] arr, int n) {
        // Sort the array in descending order
        Arrays.sort(arr);
        int length = arr.length;

        // Ensure n is within bounds
        if (n > 0 && n <= length) {
            // Return the nth largest number
            return arr[length - n];
        } else {
            System.out.println("Invalid value of 'n'");
            return -1; // Invalid value of 'n'
        }
    }

    static void countEvenOddDigits(int[] num){
        int evenCount=0;
        int oddCount=0;

        int arrayNums[] = num;
        for(int i=0; i<arrayNums.length; i++){
            if(arrayNums[i]%2==0){
                evenCount++;
            }else if(arrayNums[i]%2!=0){
                oddCount++;
            }
        }
        System.out.println("Even count: "+evenCount);
        System.out.println("Odd count: "+oddCount);
    }
}



// 3 4 1 2      1 2 3 4
// len=4
// 2nd = 2


