package com.programsets.set2.Thu250424;

public class LargestOfThree {
    public static void main(String[] args) {
        int n1=10, n2=20, n3=30;

        int large = n1 > n2 ? n1 : n2;
        int largest = n3 > large ? n3 : large;

        System.out.println("Largest number: "+largest);
    }
}
