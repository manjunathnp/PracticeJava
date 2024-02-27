package com.collectionPractice;

import java.util.HashMap;
import java.util.HashSet;

public class HashMapDemo1 {
    public static void main(String[] args) {
        HashMap hm = new HashMap();

        hm.put(101, "Haris");
        hm.put(102, "David");
        hm.put(103, "Paul");
        hm.put(104, "Scott");
        hm.put(105, "Smith");
        hm.put(103, "X");
        hm.put(106, "Kane");

        System.out.println(hm); // {101=Haris, 102=David, 103=X, 104=Scott, 105=Smith, 106=Kane}


        Object val=hm.get(105);
        System.out.println(val);    // Smith

        hm.remove(106);
        System.out.println(hm); // {101=Haris, 102=David, 103=X, 104=Scott, 105=Smith}

        System.out.println(hm.containsKey(106));    // false
        System.out.println(hm.containsValue("Kane"));   // false

        System.out.println(hm.isEmpty());   // false

        System.out.println(hm.keySet());    // [101, 102, 103, 104, 105]
        System.out.println(hm.values());    // [Haris, David, X, Scott, Smith]




    }
}
