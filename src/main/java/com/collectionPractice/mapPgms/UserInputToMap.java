package com.collectionPractice.mapPgms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserInputToMap  {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the total entries: ");
        int totalEntries = scanner.nextInt();

        for(int i=0; i<totalEntries; i++){
            System.out.println("Enter the Key-"+(i+1)+": ");
            String key = scanner.next();

            System.out.println("Enter the Value-"+(i+1)+": ");
            int value = scanner.nextInt();

            hashMap.put(key, value);
        }
        System.out.println("Map Elements:");
        hashMap.forEach((k, v) -> System.out.println(k+": "+v));
    }
}
