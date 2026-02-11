package com.engineeringdigest.corejava.Java_8;

import java.util.function.Predicate;

public class PredicatedDemo {
    public static void main(String[] args) {

        // Return a turn or false value
        Predicate<Integer> isEven = x-> x % 2 == 0;
        System.out.println(isEven.test(25));
    }
}
