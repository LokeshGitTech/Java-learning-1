package com.engineeringdigest.corejava.innerclasses.MemberInnerClass;

public class Engine1 {

    private  Car1 car1;

    public Engine1(Car1 car1) {
        this.car1 = car1;
    }

    public void start() {
        System.out.println("engine started ....");
    }

    public void stop() {
        System.out.println("engine stopped.....");
    }
}
