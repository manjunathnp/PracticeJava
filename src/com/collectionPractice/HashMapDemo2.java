package com.collectionPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo2 {
    public static void main(String[] args) {
        //HashMap hm = new HashMap();
        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        hm.put(101,"Haris");
        hm.put(102,"David");
        hm.put(103,"Paul");
        hm.put(104,"Scott");
        hm.put(105,"Smith");

        //EntrySet
        System.out.println(hm.entrySet());  //[101=Haris, 102=David, 103=Paul, 104=Scott, 105=Smith]

        for(Object key: hm.keySet()){
            System.out.print(key+" ");  // 101 102 103 104 105
        }
        System.out.println();
        for(Object val: hm.values()){
            System.out.print(val+" ");  // Haris David Paul Scott Smith
        }

        System.out.println();
        for(Object key: hm.keySet()){
            System.out.print(key+" : "+hm.get(key)+"\n");
            /*  101 : Haris
                102 : David
                103 : Paul
                104 : Scott
                105 : Smith */
        }

        // Entry methods
        for(Object entry: hm.entrySet()){
            System.out.println(entry);
            /*  101=Haris
                102=David
                103=Paul
                104=Scott
                105=Smith */
        }

        for(Map.Entry entry: hm.entrySet()){    // Map.Entry is the type of entry
            System.out.println(entry.getKey()+": "+entry.getValue());
            /*  101: Haris
                102: David
                103: Paul
                104: Scott
                105: Smith */
        }

        Set set = hm.entrySet();
        Iterator it=set.iterator();
        while (it.hasNext()){
            Map.Entry entry= (Map.Entry) it.next();
            System.out.println(entry.getKey()+": "+entry.getValue());
            /*  101: Haris
                102: David
                103: Paul
                104: Scott
                105: Smith */
        }
    }
}
