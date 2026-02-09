package com.engineeringdigest.corejava.Collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Types for create a ArrayList

public class Main {
    public static void main(String[] args) {
        // Type 1 for create arrayList using a List ref
        List< String> list  = new ArrayList<>();
        System.out.println(list.getClass().getName());

        // in asList be can not remove or add element just me do replace
        List<String> list1 = Arrays.asList("monday", "sunday");
        System.out.println(list1.getClass().getName());

        list1.set(1, "sgskgfl");
        System.out.println(list1.get(1));


        String[] array = {"Apple", "Banana", "Cherry"};
        // Pass simple array in asList method for create a array.
        List<String> list2 = Arrays.asList(array);
        System.out.println(list2.getClass().getName());

        // In of method we can not add, remove and replace also.
        List<Integer> integers = List.of(1, 2, 3);


    }
}
