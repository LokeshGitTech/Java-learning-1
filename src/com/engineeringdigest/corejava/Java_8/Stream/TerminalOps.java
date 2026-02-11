package com.engineeringdigest.corejava.Java_8.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TerminalOps {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);

        // 1. collect
        list.stream().skip(1).collect(Collectors.toList());
        list.stream().skip(1).toList();

        // 2. forEach
        list.stream().forEach(x -> System.out.println(x));

        //3. reduce : Combine elements to produce  SINGLE RESULT.
        list.stream().reduce((x, y) -> x + y);

        // 4. count

        // 5, anyMatch, allMatch , noneMatch

//        boolean b = list.stream().anyMatch(x -> x%2 ==0);
//        System.out.println(b);
        boolean b1 = list.stream().allMatch(x-> x > 0);
        System.out.println(b1);
        boolean b2 = list.stream().noneMatch(x -> x < 0);
        System.out.println(b2);

        // 6. findFirst, findAny
        System.out.println(list.stream().findFirst().get());
        System.out.println(list.stream().findAny().get());


        // EXAMPLES 1
        List<String> names = Arrays.asList("Anna", "Boc", "Charlie", "David");
        System.out.println(names.stream().filter(x -> x.length() > 3).toList());

        // EXAMPLES 2: Squaring and Sorting Numbers
        List<Integer> numbers = Arrays.asList(5, 2,8,9,6,6,7);
        System.out.println(numbers.stream().map(x -> x * x).sorted().toList());


        // EXAMPLES 2: Summing Values
        List<Integer> num = Arrays.asList(1,2,3,4,5);
        System.out.println(num.stream().reduce(Integer::sum).get());
//        System.out.println(num.stream().reduce(0, (a, b) -> a + b));

        // EXAMPLES 3: Counting Occurrences of a Character
        String sentence = "Hello world";
        System.out.println(sentence.chars().filter(x -> x == 'l').count());

        // stateful and stateless operation


    }
}
