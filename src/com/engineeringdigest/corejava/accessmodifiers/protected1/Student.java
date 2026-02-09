package com.engineeringdigest.corejava.accessmodifiers.protected1;

// Protected: it will tell us we can access class members within class,
// outside a class but same package, outside package
// but we need to make subclass then we can access.


public class Student {

//    Student() {
//        System.out.println("protected constructor...");
//    }

    protected int age = 10;

    protected void A() {
        System.out.println("protected method accessed");
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
