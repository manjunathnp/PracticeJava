package com.collectionPractice.mapPgms;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortHashMapByKey {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("John", 25);
        hashMap.put("Steve", 22);
        hashMap.put("David", 27);

        TreeMap<String,Integer> sortedHashmap = new TreeMap<>(hashMap);
        System.out.println("Sorted Data: ");
        for(Map.Entry<String, Integer> entry: sortedHashmap.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
    }
}
