package com.engineeringdigest.corejava.WrapperClass;

public class Test2 {
    public static void main(String[] args) {
        Integer b = 1;
        fun(b);
        System.out.println(b);
    }

    private static  void fun(Integer a) {
        a = 2;
    }
}


