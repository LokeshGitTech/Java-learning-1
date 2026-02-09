package com.engineeringdigest.corejava.accessmodifiers.private1;

public class Student {


    // its not allow to create a object in other class.
//    private Student (){
//
//    }

    private int age = 18;

    private void m1() {
        System.out.println("hiii");
    }

    public static void main(String[] args) {
        Student aa = new Student();
        // We can access here because private variable access in same class
        System.out.println(aa.age);

        aa.m1();
    }

    private class A{

    }
}
