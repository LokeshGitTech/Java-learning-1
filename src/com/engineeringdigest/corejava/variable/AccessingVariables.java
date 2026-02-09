package com.engineeringdigest.corejava.variable;

public class AccessingVariables {
    static int a = 10; // static variable class se deals with class // class level hote he

    int b = 20; // you need to create a object the using object reference you can access.


    void add() {
        int a = 77;
        System.out.println(a);
    }

    public static void main(String[] args) {

        AccessingVariables theObject = new AccessingVariables();
        System.out.println(theObject.b); // access by object because variable is instance variable or non-static variable.
        // System.out.println(AccessingVariables.b); // not able to access because its was a instance variable or not static,

        // Try to call local variable in method
        theObject.add();

        System.out.println(AccessingVariables.a); // access by directly class name because its static variable.


        // Can we call static variable by a object ?
        // yes
        System.out.println(theObject.a);
    }
}
