package com.scrible;

import java.util.Arrays;

public class NthLargestNumber {
    public static void main(String[] args) {
        // Example array
        int[] numbers = {12, 5, 23, 54, 7, 32, 19};

        // Specify the value of 'n'
        int n = 13; // Change this to find the nth largest number

        int nthLargest = findNthLargest(numbers, n);

        System.out.println("The " + n + "th largest number is: " + nthLargest);
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
}

