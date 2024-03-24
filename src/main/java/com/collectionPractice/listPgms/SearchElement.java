package com.collectionPractice.listPgms;

import java.util.ArrayList;
import java.util.List;

public class SearchElement {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("e1");
        list.add("e2");
        list.add("e3");

        System.out.println(list.contains("e1"));
        System.out.println(list.contains("e4"));
    }
}
