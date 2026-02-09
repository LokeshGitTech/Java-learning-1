package com.engineeringdigest.corejava.oops.abstraction;

public class StudentChild extends Student{

    @Override
    void aadi() {
        System.out.println("Body mil gai......");
    }

    @Override
    void aakash() {
        System.out.println("Body mil gai......");
    }

    public static void main(String[] args) {
        StudentChild s = new StudentChild();

        s.aadi();
        s.aakash();
        s.fun();

        Student.m1();
    }
}
