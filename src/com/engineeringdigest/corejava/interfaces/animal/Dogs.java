package com.engineeringdigest.corejava.interfaces.animal;

public class Dogs implements Animal {

    @Override
    public void eat() {
        System.out.println("Dong is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}
