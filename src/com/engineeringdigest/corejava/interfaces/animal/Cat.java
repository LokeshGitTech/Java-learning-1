package com.engineeringdigest.corejava.interfaces.animal;

public class Cat implements Animal {


    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping");
    }
}
