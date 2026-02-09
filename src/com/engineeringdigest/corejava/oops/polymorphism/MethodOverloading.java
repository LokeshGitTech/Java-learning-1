package com.engineeringdigest.corejava.oops.polymorphism;

// If the class having a two or more same name method but different parameter
// list is known as method overloading

// No of parameter can be diff
// Type of parameter can be diff
// Sequence of parameters can be diff

// in method overloading return type can be same or diff.


public class MethodOverloading {
    int demo(int a) {
        return a;
    }

    void demo(int a , String str) {

    }

    void demo(int a , int number) {

    }

    void demo(String a , int number) {

    }
}
