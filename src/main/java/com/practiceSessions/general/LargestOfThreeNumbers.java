package com.practiceSessions.general;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        int n1=10, n2=100, n3=-19;

        int large = n1>n2? n1:n2;
        int largest = n3>large? n3:large;

        System.out.println("Largest: "+largest);
    }
}
