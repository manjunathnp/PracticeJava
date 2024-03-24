package com.collectionPractice.mapPgms;

import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortHashMapByValue {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("John", 25);
        hashMap.put("Steve", 22);
        hashMap.put("David", 27);

        List<Map.Entry<String, Integer>> list = new ArrayList<>(hashMap.entrySet());
        list.sort(Map.Entry.comparingByValue());

        for(Map.Entry<String, Integer> entry: hashMap.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
    }
}
