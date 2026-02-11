package com.engineeringdigest.corejava.Java_8;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<Integer, Integer> doubleIt = x -> 2 *x;
        Function<Integer, Integer> tripleIt = x -> 3 *x;
        System.out.println(doubleIt.andThen(tripleIt).apply(20));
        System.out.println(doubleIt.apply(100));


        // Jo ham input me dege wahi output me aa jayega.
       Function<Integer, Integer>  identity = Function.identity();
       Integer res = identity.apply(5);
       System.out.println(res);

       // Consumer
        Consumer<Integer> print =  x -> System.out.println(x);
        print.accept(555);

        List<Integer> list = Arrays.asList(1, 21, 3);
        Consumer<List<Integer>> printList = x -> {
            for (int i : x) {
                System.out.println(i);
            }
        };
        printList.accept(list);

        // Supplier
        Supplier<String> giveHelloWorld =() -> "Hello World";
        System.out.println(giveHelloWorld.get());


        // combine example
        Predicate<Integer> predicate = x -> x %2 == 0;
        Function<Integer, Integer> function = x -> x*x;
        Consumer<Integer> consumer = x -> System.out.println(x);
        Supplier<Integer> supplier = () -> 100;

        if(predicate.test(supplier.get())){
            consumer.accept(function.apply(supplier.get()));
        }

        // UnaryOperator, BinaryOperator
        UnaryOperator<Integer> a = x -> 2 * x;
        BinaryOperator<Integer> b = (x, y) -> x+y;


        // Method Reference ---> use method without invoking & in place of lamba expression
        List<String> student = Arrays.asList("Ram", "Shyam", "Ghanshyam");
        student.forEach(x -> System.out.println(x));
        student.forEach(System.out::println);

        // Constuctor reference
        List<String> names = Arrays.asList("A", "B", "c");


    }
}
