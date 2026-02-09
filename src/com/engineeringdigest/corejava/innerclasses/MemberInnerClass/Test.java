package com.engineeringdigest.corejava.innerclasses.MemberInnerClass;

public class Test {

    public static void main(String[] args) {

    Car car = new Car("Tata Safari");

    Car.Engine engine = car.new Engine();

    engine.start();
    engine.stop();

    }
}
