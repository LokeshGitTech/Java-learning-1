package com.engineeringdigest.corejava.MultiThreading.Synchroniza;

public class Test {
    public static void main(String[] args) {
        Counter counter = new Counter();
        MyTherad t1 = new MyTherad(counter);
        MyTherad t2 = new MyTherad(counter);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println(counter.getCount());
    }
}
