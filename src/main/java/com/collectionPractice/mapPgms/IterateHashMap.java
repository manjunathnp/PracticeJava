package com.collectionPractice.mapPgms;

import java.util.HashMap;
import java.util.Map;

public class IterateHashMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("John", 25);
        hashMap.put("Steve", 22);
        hashMap.put("David", 27);

        for(Map.Entry<String, Integer> entry: hashMap.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
    }
}
