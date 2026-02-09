package com.engineeringdigest.corejava.Math;

public class Test {
    public static void main(String[] args) {
        int a =10;
        int b = 51;
        int max = Math.max(a, b);
        System.out.println(max);

        int min = Math.min(7, 9);
        System.out.println(min);

        double d = 1.12;
        double ceil =  Math.ceil(d);
        System.out.println(ceil);
        System.out.println(ceil);
        System.out.println(Math.floor(d));

        System.out.println((int)(Math.random() * 11));
    }

}
