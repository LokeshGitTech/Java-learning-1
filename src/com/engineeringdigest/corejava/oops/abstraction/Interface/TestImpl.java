package com.engineeringdigest.corejava.oops.abstraction.Interface;

public class TestImpl implements Test {

    @Override
    public void m1() {
        System.out.println("body of m1......");
    }

    @Override
    public void fun() {
        System.out.println("body of fun......");
    }

    public static void main(String[] args) {
        TestImpl tt = new TestImpl();
        tt.m1();
        tt.fun();
        System.out.println(Test.a);
        System.out.println(Test.b);
        System.out.println(Test.k);

        // call static method by direct class/Interface name
        Test.s1();

        // call default method by object
        tt.s2();
    }
}
