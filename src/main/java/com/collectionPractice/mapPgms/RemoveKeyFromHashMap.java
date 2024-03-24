package com.collectionPractice.mapPgms;

import java.util.HashMap;
import java.util.Map;

public class RemoveKeyFromHashMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();

        hashMap.put("John", 25);
        hashMap.put("Steve", 22);
        hashMap.put("David", 27);

        System.out.println("Before Key Removal: "+hashMap);
        hashMap.remove("Steve");
        System.out.println("After Key Removal: "+hashMap);
    }
}
