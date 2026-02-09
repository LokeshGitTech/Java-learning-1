package com.engineeringdigest.corejava.oops.abstraction;

// Abstraction is the process of hiding the implementation details from the users and provide
// only essential functionality to the user.

// we can achieve abstraction in java by using two ways.
// 1) abstract class 2) interface

// Abstract class => if class having abstract keyword in its declaration
// then class known as abstract class.

// Abstract class can contain instance variable , static variable, local variable
// constructor , abstract class contain instance method and abstract method.

// if the class having attlist one abstract method then tou need define your
// class as abstract class. method without body is called abstract method.


// we can not create a object of abstract class

abstract class Student {    // abstract class
    // syntax: abstract return type methodName();

    abstract void aadi();

    abstract  void aakash();

    void fun(){
        System.out.println("Already have a body......");
    }

    static void m1() {

    }
}
