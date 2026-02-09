package com.engineeringdigest.corejava.oops.inharitance.hierarchical;

public class C extends A {
    void m3(){
        System.out.println("m3 method of class C");
    }

    public static void main(String[] args) {
        C cc = new C();
        cc.m1();
    }
}
