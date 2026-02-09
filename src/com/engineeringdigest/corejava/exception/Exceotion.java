package com.engineeringdigest.corejava.exception;

public class Exceotion {
    public static void main(String[] args) {
        System.out.println("hii");
        System.out.println("hello");
        System.out.println("Hey");

        try {
             System.out.println(10/0);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Bye");
    }
}
