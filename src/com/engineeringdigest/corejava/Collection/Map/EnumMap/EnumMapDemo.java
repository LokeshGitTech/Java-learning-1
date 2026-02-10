package com.engineeringdigest.corejava.Collection.Map.EnumMap;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapDemo {
    public static void main(String[] args) {

        // array of size same as enum
        // [_,"Gym",_ ,_ ,_]
        // no hashing
        // ordinal/index is used
        Map<Day , String> map = new EnumMap<>(Day.class);
        map.put(Day.THESDAY , "Reading");
        map.put(Day.MONDAY , "Gym");
        System.out.println(map);
    }
}

enum Day {
        MONDAY, THESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
