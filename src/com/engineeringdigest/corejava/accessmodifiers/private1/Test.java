package com.engineeringdigest.corejava.accessmodifiers.private1;

public class Test {
    public static void main(String[] args) {
        Student ss = new Student();

        // we can no access here because its private variable.
        // Different class.
//        System.out.println(ss.age);

        // not access here because its private method
//        ss.m1();

    }
}
