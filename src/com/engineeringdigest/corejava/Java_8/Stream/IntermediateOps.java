package com.engineeringdigest.corejava.Java_8.Stream;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOps {
    public static void main(String[] args) {
        // Intermediate operation transform a stream into another stream.
        // Thet are lazy, meaning they don't execute until; a terminal operation is invoked.

        // 1) filter
        List<String> list =  Arrays .asList("Ram" , "Shyam" , "DShanshyam", "Akshit", "Shyam");
        Stream<String> filteredStream = list.stream().filter(x -> x.startsWith("A")); // no filter in is point

        long res = list.stream().filter(x -> x.startsWith("A")).count();
        System.out.println(res);


        // 2) map
        Stream<String> stringStream = list.stream().map(x -> x.toUpperCase());

        // 3) sorted
        Stream<String> sortedStream = list.stream().sorted();
        Stream<String> sortedStreamUsingComparetor = list.stream().sorted((a,b)-> b.length() -a.length());

        // 4. distinct
        long s = list.stream().filter(x -> x.startsWith("S")).distinct().count();
        System.out.println(s);

        // 5) limit
        System.out.println(Stream.iterate(1, x -> x + 1).limit(10).count());

        // 6) skip
        System.out.println(Stream.iterate(1, x -> x + 1).skip(7).limit(10).count());



    }
}
