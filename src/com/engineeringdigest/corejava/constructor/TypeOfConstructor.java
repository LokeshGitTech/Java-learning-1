package com.engineeringdigest.corejava.constructor;

public class TypeOfConstructor {

    //  Non - parameterized constructor. also call default constructor.
    TypeOfConstructor(){
        System.out.println("Non- Parameterized called !!!!");
    }

    // Parameterized constructor
    TypeOfConstructor(int number){
        System.out.println("Parameterized called !!!!!!");
    }

    TypeOfConstructor(int number, String str){
        System.out.println("With 2 parameters");
    }

    public static void main(String[] args) {
        // it's calling Non-Parameterized constructor.
        TypeOfConstructor a = new TypeOfConstructor();

        // it's calling Parameterized constructor.
        TypeOfConstructor b = new TypeOfConstructor(8, "Lokesh");
    }
}
