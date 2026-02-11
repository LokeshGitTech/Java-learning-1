package com.engineeringdigest.corejava.Java_8.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LazyEvaluationDemo {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ram", "Shyam", "Amit", "Ankit");

        Stream<String> stream = names.stream()
                .filter(name -> {
                    System.out.println("Filtering: " + name);
                    return name.startsWith("A");
                })
                .map(name -> {
                    System.out.println("Mapping: " + name);
                    return name.toUpperCase();
                });

        System.out.println("No terminal operation yet...");

        // Uncomment below line to trigger execution
        stream.forEach(System.out::println);
    }
}
