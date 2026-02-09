package com.engineeringdigest.corejava.oops.abstraction.Interface.objectOfInterface;

public interface Test {

    default void m1() {
        System.out.println("m1");
    }

    static void m2() {
        System.out.println("m2");
    }

    void m3();
}
