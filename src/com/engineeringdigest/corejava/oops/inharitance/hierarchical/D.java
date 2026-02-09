package com.engineeringdigest.corejava.oops.inharitance.hierarchical;

public class D extends A {
    void m4() {
        System.out.println("m4 method of class D");
    }

    public static void main(String[] args) {
        D dd = new D();
        dd.m4();
        dd.m1();
    }
}
