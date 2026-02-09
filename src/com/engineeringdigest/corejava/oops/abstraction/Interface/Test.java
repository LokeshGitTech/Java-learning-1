package com.engineeringdigest.corejava.oops.abstraction.Interface;

public interface Test {

    // interface don't have constructor
//    Test(){
//
//    }

    public static final int a  = 10;

    int b = 40;

    static int k = 50;

    final int p = 90;

    public abstract void m1();

    void fun();


    // two methods add in java 8
    static  void s1() {
        System.out.println("static methods....");
    }

    default void s2() {
        System.out.println("default methods...");
    }


}