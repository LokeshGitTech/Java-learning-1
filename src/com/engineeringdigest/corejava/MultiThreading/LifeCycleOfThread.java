package com.engineeringdigest.corejava.MultiThreading;

public class LifeCycleOfThread extends  Thread{

    @Override
    public void run() {
        System.out.println("RUNNING");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        LifeCycleOfThread t1 = new LifeCycleOfThread();
        System.out.println(t1.getState()); // NEW
        t1.start(); // Runnable
        System.out.println(t1.getState());
        Thread.sleep(100);
        System.out.println(t1.getState());
        t1.join(); // Main thread wait for finish other work (Timed_Waiting)
        System.out.println(t1.getState()); // Terminated
    }
}
