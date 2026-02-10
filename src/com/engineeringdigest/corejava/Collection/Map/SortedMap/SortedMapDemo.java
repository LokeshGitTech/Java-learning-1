package com.engineeringdigest.corejava.Collection.Map.SortedMap;

import java.util.*;

// SortedMap is an interface that extends Map and guarantees that the
// entries are sorted based on the keys, either natural ordering
// or by a specified Comparator.

public class SortedMapDemo {
    public static void main(String[] args) {
        SortedMap<Integer, String> map = new TreeMap<>((a, b) -> b-a);

        map.put(92, "Vivek");
        map.put(18, "Rahul");
        map.put(99 ,"Shubham");
        map.put(78, "Mohit");
//        System.out.println(map);

//        System.out.println(map.firstKey());
//        System.out.println(map.lastKey());
//        System.out.println(map.headMap(91));
//        System.out.println(map.tailMap(50));
//        System.out.println(map.subMap(50, 93));


        NavigableMap<Integer , String > navigableMap = new TreeMap<>();
        navigableMap.put(1 , "One");
        navigableMap.put(5 , "Five");
        navigableMap.put(2 , "Two");
        System.out.println(navigableMap);

        System.out.println(navigableMap.lowerEntry(4));
    }
}
