package com.engineeringdigest.corejava.MultiThreading;

public class Test {

    // Type 1
//    public static void main(String[] args) {
//
//        World world = new World();
//        world.start();
//
//        for(; ; ) {
//            System.out.println(Thread.currentThread().getName());
//        }
//    }

    // Type-2

    public static void main(String[] args) {

        World world = new World(); // NEW
        Thread t1 = new Thread(world);
        t1.start();
        for(; ; ) {
            System.out.println("Hello");
        }
    }

}
