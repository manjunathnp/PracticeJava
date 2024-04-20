package com.programsets.set2.Thu180424;

public class LargestOfThree {
    public static void main(String[] args) {
        int n1=100, n2=200, n3=50;

        int large = n1>n2 ? n1:n2;
        int largest = n3>large ? n3:large;

        System.out.println("Largest: "+largest);
    }
}
