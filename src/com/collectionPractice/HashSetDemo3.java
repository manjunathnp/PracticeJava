package com.collectionPractice;

import java.util.HashSet;

public class HashSetDemo3 {
    public static void main(String[] args) {
        // Union, Intersection, Difference
        HashSet<Integer> set1 = new HashSet<Integer>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        System.out.println("Set1: "+set1); // Set1: [1, 2, 3, 4, 5]

        HashSet<Integer> set2 = new HashSet<Integer>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        System.out.println("Set2: "+set2);  // Set2: [3, 4, 5]

        // Union
        set1.addAll(set2);
        System.out.println("Union: "+set1); // Union: [1, 2, 3, 4, 5]

        // Subset
        System.out.println("Subset: "+set1.containsAll(set2)); // Subset: true

        // Intersection
        set1.retainAll(set2);
        System.out.println("Intersection: "+set1);  // Intersection: [3, 4, 5]

        // Difference
        set1.removeAll(set2);
        System.out.println("Difference: "+set1);    // Difference: []




    }
}
