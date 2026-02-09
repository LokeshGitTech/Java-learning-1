package com.engineeringdigest.corejava.Collection.Map.HashMap.LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String , Integer> linkedHashMap = new LinkedHashMap<>();
//        HashMap<String , Integer> hashMap = new HashMap<>();
        linkedHashMap.put("Orange", 10);
        linkedHashMap.put("Apple", 12);
        linkedHashMap.put("Guava", 20);

        for(Map.Entry<String, Integer> x: linkedHashMap.entrySet()){
            System.out.println(x.getKey() + " : " + x.getValue());
        }


    }
}
