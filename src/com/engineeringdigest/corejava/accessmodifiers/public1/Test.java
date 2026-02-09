package com.engineeringdigest.corejava.accessmodifiers.public1;

public class Test {

    public static void main(String[] args) {
        Student s =new Student(5); // access in other class
        System.out.println(s.xx);

        s.xxMethod(); // access in other class
    }
}
