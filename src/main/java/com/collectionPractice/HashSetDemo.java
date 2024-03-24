package com.collectionPractice;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();

        HashSet hashSet1 = new HashSet(10, 0.95F);

        hashSet.add(100);
        hashSet.add(null);
        hashSet.add(true);
        hashSet.add("Hello");
        hashSet.add('a');

        System.out.println(hashSet); // [null, a, 100, Hello, true]

        hashSet.remove(null);
        System.out.println(hashSet);    // [a, 100, Hello, true]

        System.out.println(hashSet.contains(null)); // false

        System.out.println(hashSet.isEmpty());  // false

        // Read data
        for(Object obj:hashSet){
            System.out.print(obj+" "); // a 100 Hello true
        }

        System.out.println();
        // Iterator
        Iterator iterator=hashSet.iterator();
        while (iterator.hasNext())
            System.out.print(iterator.next()+" "); // a 100 Hello true


    }
}
