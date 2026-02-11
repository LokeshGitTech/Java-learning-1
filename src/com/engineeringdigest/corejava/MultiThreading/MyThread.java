package com.engineeringdigest.corejava.MultiThreading;

import java.awt.*;

public class MyThread extends Thread{

    public MyThread(String name){
        super(name);
    }

    @Override
    public void run() {
        for(int i = 1; i<=5; i++){
            String a = "";
            for(int j = 0; j < 100000; j++){
                a+= "a";
            }
                System.out.println(Thread.currentThread().getName() + "  Priority: " + Thread.currentThread().getPriority() + " - count:  " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread l = new MyThread("Low Priority Thread");
        MyThread m = new MyThread("Medium Priority Thread");
        MyThread h = new MyThread("High Priority Thread");

        l.setPriority(Thread.MIN_PRIORITY);
        m.setPriority(Thread.NORM_PRIORITY);
        h.setPriority(Thread.MAX_PRIORITY);

        l.start();
        m.start();
        h.start();


//        t1.join();
//        System.out.println("Hello");
    }
}

// Start
// run
// sleep
// join

// interact -  stop thread whatever doing that time
// yield - Give to chnage other therad also to run
// setDaemon - Backgrond threads , JVM not wait for finish Daemon thread work finish.
