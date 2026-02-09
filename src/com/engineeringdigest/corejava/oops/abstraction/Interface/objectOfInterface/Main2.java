package com.engineeringdigest.corejava.oops.abstraction.Interface.objectOfInterface;

public class Main2 {

    void fun(){
        System.out.println("instance method create in class, need to object to call, ");
    }

    static void drive(){
        System.out.println("static method create in class, no need to object reference");
    }

    public static void main(String[] args) {

        Test test = new Test() {
            @Override
            public void m3() {
                System.out.println("m3");
            }
        };

        test.m1();
        test.m3();


        Test.m2();
    }
}
