package com.engineeringdigest.corejava.Collection.List.VectorAndStack;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);

//        Integer removeElements = stack.pop(); // pop method return pop value
//        System.out.println(stack);

        // just see which item store on top.
//        Integer peek = stack.peek();
//        System.out.println(peek);

        //
        int search = stack.search(3);
        System.out.println(search);
    }
}
