package com.collectionPractice;

import java.util.*;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>();
        Hashtable hashtable1=new Hashtable<>();
        HashMap<Integer, String> hashtable = new HashMap<Integer, String>();

        hashtable.put(101, "Blue");
        hashtable.put(102,"Green");
        hashtable.put(103, "Red");
        hashtable.put(104, "Yellow");

        // put()
        ht.put(1, "One");
        ht.put(2, "Two");
        System.out.println("HashTable: " + ht);

        // get()
        System.out.println("Value at key 1: " + ht.get(1));

        // containsKey()
        System.out.println
                ("Does Hashtable contain 1 as key: " + ht.containsKey(1));

        // containsValue()
        System.out.println
                ("Does Hashtable contain 'One' as value: " + ht.containsValue("One"));

        // isEmpty()
        System.out.println("Is Hashtable empty: " + ht.isEmpty());

        // size()
        System.out.println("Size of Hashtable: " + ht.size());

        // remove()
        ht.remove(1);
        System.out.println("HashTable after remove: " + ht);

        // contains()
        System.out.println
                ("Does Hashtable contain 'Two': " + ht.contains("Two"));

        // elements()
        Enumeration<String> e = ht.elements();
        while (e.hasMoreElements()) {
            System.out.println("Value: " + e.nextElement());
        }

        for(Map.Entry element: hashtable.entrySet()){
            System.out.println(element.getKey()+": "+element.getValue());
        }

        Set set = hashtable.entrySet();
        Iterator it=set.iterator();
        while (it.hasNext()){
            Map.Entry entry= (Map.Entry) it.next();
            System.out.println(entry.getKey()+": "+entry.getValue());

        }

        // clear()
        ht.clear();
        System.out.println("HashTable after clear: " + ht);
    }


}
