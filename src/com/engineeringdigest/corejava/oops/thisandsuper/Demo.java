package com.engineeringdigest.corejava.oops.thisandsuper;

// this keyword
public class Demo {
    static String apple = "XXXXXXXXXXXX"; // not recommended
    int id;
    String name;

//    Demo(int id, String name) {
//        this.id = id;
//        this.name = name;
//        this.show();
//    }

    void show() {
        System.out.println("Id   : " + id);
        System.out.println("Name   : " + name);
    }

    public static void main(String[] args) {
//        Demo dd = new Demo(101, "Lalit");
//        Demo BB = new Demo(102, "Rahul");
        System.out.println();
       // dd.show();
//        BB.show();

        Demo xx = new Demo();
        xx.show();
    }
}
