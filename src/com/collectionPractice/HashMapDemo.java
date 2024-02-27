package com.collectionPractice;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        // put(key, value)
        map.put(1, "Value1");
        map.put(2, "Value2");
        System.out.println("HashMap: " + map);

        // get(key)
        System.out.println("Get Value of Key 1: " + map.get(1));

        // containsKey(key)
        System.out.println("Contains Key 1: " + map.containsKey(1));

        // containsValue(value)
        System.out.println("Contains Value 'Value1': " + map.containsValue("Value1"));

        // remove(key)
        map.remove(1);
        System.out.println("After Remove Key 1: " + map);

        // isEmpty()
        System.out.println("Is Empty: " + map.isEmpty());

        // size()
        System.out.println("Size: " + map.size());

        // clear()
        map.clear();
        System.out.println("After Clear: " + map);

        // Adding data again for next methods
        map.put(1, "Value1");
        map.put(2, "Value2");

        // keySet()
        System.out.println("Key Set: " + map.keySet());

        // values()
        System.out.println("Values: " + map.values());

        // entrySet()
        System.out.println("Entry Set: " + map.entrySet());

        // putAll(map)
        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(3, "Value3");
        map.putAll(map2);
        System.out.println("After PutAll: " + map);

        // equals(object)
        HashMap<Integer, String> map3 = new HashMap<>();
        map3.put(1, "Value1");
        map3.put(2, "Value2");
        map3.put(3, "Value3");
        System.out.println("Equals: " + map.equals(map3));

        // hashCode()
        System.out.println("Hash Code: " + map.hashCode());

        // clone()
        HashMap<Integer, String> cloneMap = (HashMap<Integer, String>) map.clone();
        System.out.println("Cloned Map: " + cloneMap);
    }
}
