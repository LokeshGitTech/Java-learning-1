package com.engineeringdigest.corejava.MultiThreading.Synchroniza;

public class MyTherad extends Thread {
    private Counter counter;

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }

    public  MyTherad(Counter counter) {
        this.counter = counter;
    }
}
