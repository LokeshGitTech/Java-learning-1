package com.engineeringdigest.corejava.innerclasses.MemberInnerClass;

public class Test1 {
    public static void main(String[] args) {
        Car1 car1 = new Car1("Maruti");
//        Engine1 engine1  = new Engine1(car1);
        Car1.Engine engine = car1.new Engine();
//        engine1.start();

//        engine1.stop();


    }
}

