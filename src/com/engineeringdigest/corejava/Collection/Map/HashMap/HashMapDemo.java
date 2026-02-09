package com.engineeringdigest.corejava.Collection.Map.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Akshit");
        map.put(3, "Shubham");
        map.put(2, "Neha");

        System.out.println(map);

        String student = map.get(3);
        System.out.println(student);

        // check key is present in our map.
        System.out.println(map.containsKey(2));

        // Checks value
        System.out.println(map.containsValue("Shubham"));

        // print all keysets
        Set<Integer> keys = map.keySet();
        for(int x: keys){
            System.out.println(x);
        }

        Set<Map.Entry<Integer, String>> entries = map.entrySet();

        for(Map.Entry<Integer, String> entry: entries){
            System.out.println(entry.getKey() + " : " + entry.getValue());
            entry.setValue(entry.getValue().toUpperCase());
        }

        System.out.println(map);
    }
}
