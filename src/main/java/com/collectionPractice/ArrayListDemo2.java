package com.collectionPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(100);
        numbers.add(200);
        numbers.add(500);
        numbers.add(50);
        numbers.add(1000);
        System.out.println(numbers);    // [100, 200, 500, 50, 1000]

        ArrayList dupArray = new ArrayList<>();
        dupArray.add(1);
        dupArray.add(2);
        dupArray.add(3);
        dupArray.add(1);
        dupArray.add(1);

        dupArray.addAll(numbers);
        System.out.println(dupArray);   // [1, 2, 3, 1, 1, 100, 200, 500, 50, 1000]

        dupArray.removeAll(numbers);
        System.out.println(dupArray);   // [1, 2, 3, 1, 1]

        System.out.println("Before Sorting(ASC): "+numbers);    // [100, 200, 500, 50, 1000]
        Collections.sort(numbers);
        System.out.println("After Sorting(ASC): "+numbers); // [50, 100, 200, 500, 1000]

        System.out.println("Before Sorting(DSC): "+dupArray);   // [1, 2, 3, 1, 1]
        Collections.sort(dupArray, Collections.reverseOrder());
        System.out.println("After Sorting(DSC): "+dupArray);    // [3, 2, 1, 1, 1]

        Collections.shuffle(numbers);
        System.out.println(numbers);    // [200, 100, 1000, 50, 500]

        String[] testStr = {"one", "two", "three"}; // Converting Array to ArrayList
        ArrayList al = new ArrayList(Arrays.asList(testStr));
        System.out.println(al); // [one, two, three]



    }
}
