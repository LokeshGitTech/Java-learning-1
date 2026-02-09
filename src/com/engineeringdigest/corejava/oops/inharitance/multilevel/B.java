package com.engineeringdigest.corejava.oops.inharitance.multilevel;

public class B extends A {
    void m2() {
        System.out.println("m2 method of class B");
    }

    public static void main(String[] args) {
        B bb = new B();
//      bb.m2();
        bb.m1();
        System.out.println();
    }
}

//class C extends  A {
//
//}
//
//class D extends A {
//
//}
