package com.collectionPractice;

import java.util.HashSet;

public class HashSetDemo2 {
    public static void main(String[] args) {
        HashSet<Integer> evenNumbers = new HashSet<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        evenNumbers.add(6);
        System.out.println(evenNumbers);

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(10);

        numbers.addAll(evenNumbers);
        System.out.println(numbers);    // [1, 2, 4, 6, 10]

        numbers.removeAll(evenNumbers);
        System.out.println(numbers);    // [1, 10]


    }
}
