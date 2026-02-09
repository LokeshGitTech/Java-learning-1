package com.engineeringdigest.corejava.oops.inharitance.multilevel;

public class D extends C {
    void m4() {
        System.out.println("m4 method of class D");
    }

    public static void main(String[] args) {
        D dd = new D();

        dd.m1();
        dd.m2();
        dd.m3();
        dd.m4();

        System.out.println();
        C cc = new C();
        cc.m2();
    }
}
