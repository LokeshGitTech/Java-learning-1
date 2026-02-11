package com.engineeringdigest.corejava.MultiThreading.Synchroniza;

public class Counter {
    private int count = 0;


    // synchronized method
    public synchronized void increment() {
        count++;
    }

//    public synchronized void increment() {
//        // synchronized block
//        synchronized(this) {
//            count++;
//        }
//    }

    public int getCount() {
        return count;
    }
}
