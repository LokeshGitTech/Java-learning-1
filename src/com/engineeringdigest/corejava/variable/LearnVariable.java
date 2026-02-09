package com.engineeringdigest.corejava.variable;

public class LearnVariable {

    // local variable in constructor
    LearnVariable(int a) {// local variable
        int b = 20; // local variable
    }

    // Variable is a container which is used to store data in computer memory.
    // Variable is pointing to the memory location (location address).


    // types of variables
    // 1) static variable / non-instance
    // 2) instance variable / non-static
    // 3) local variable


    // 1) static variable
    // => if the variable is created inside the class and outside the method with static variable.

    // static int a = 8;

    // 2) instance variable
    // => if the variable is created inside the class and outside a method but don't have static keyword this variable known as instance variable.

    // int b = 40;


    // 3) if the variable is created inside the method or method parameter or constructor parameter or inside the constructor this
    void add (int b) { // int b also local variable
        int a = 10; //  local variable
    }


    public static void main(String[] args) {

    }

}
