package com.engineeringdigest.corejava.constructor;

public class PrivateConstructor {

    private PrivateConstructor() {

    }

    void display() {
        System.out.println("Display method......");
    }

    public static void main(String[] args) {
        PrivateConstructor aa = new PrivateConstructor();
        aa.display();
    }

}
