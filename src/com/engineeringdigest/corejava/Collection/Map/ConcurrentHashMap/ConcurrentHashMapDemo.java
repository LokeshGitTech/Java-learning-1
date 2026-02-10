package com.engineeringdigest.corejava.Collection.Map.ConcurrentHashMap;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        // Java 7 ---> segment based locking --> 16 segment --> smaller hashmaps
        // Only the segment being written to or read from is locked.
        // Read: Do not require looking unless there is a write operation happening on the same segment
        // Write: lock

        // Java 8 ---> no segmentation
        // ---> Compare and swap approach ---> no looking except resizing or collision
    }   // Thread a (last saw) --> x = 43
        // Thread A work --> z to 50
        // if x is still 41, then change it to 50 else don't change and ready.

        // put ---> index
}
