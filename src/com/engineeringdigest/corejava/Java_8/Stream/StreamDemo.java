package com.engineeringdigest.corejava.Java_8.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        // Stream is feature introduce in Java 8
        // process collections of data in a functional and declarative manner
        //Simplify Data Processing
        // Embrace Functional Programming
        // Improve Readability and Maintainability
        // Enable Easy Parallelism

        // How to Use Streams ?
        // Source , intermediate operation and terminal operation

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int count = 0;
        for(int i :numbers ){
            if( i%2 == 0) {
                count++;
            }
        }

        System.out.println(count);
        System.out.println(numbers.stream().filter(x -> x%2 == 0).count());

        //Creating Streams
        // 1. From collections
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> stream =list.stream();

        // 2. From Arrays
        String[] array = {"a", "b", "c"};
        Stream<String> stream1 = Arrays.stream(array);

        // 3. USing a Stream.of()
        Stream<String> stream2 = Stream.of("a", "b", "c");

        // 4. Infinite streams
        Stream<Integer> generate = Stream.generate(()-> 1);
        Stream<Integer> iterate = Stream.iterate(1, x -> x + 1);



    }
}
