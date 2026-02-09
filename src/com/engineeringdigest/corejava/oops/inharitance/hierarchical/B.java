package com.engineeringdigest.corejava.oops.inharitance.hierarchical;


public class B extends A {
    void m2() {
        System.out.println("m2 method of class B");
    }

    public static void main(String[] args) {
        A aa = new A();
        B bb = new B();
        C cc = new C();
        cc.m1();
        bb.m1();
        aa.m1();
    }
}

