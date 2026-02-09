package com.engineeringdigest.corejava.Collection.List.LinkList;

//Linked List is a class which implements List interface its present in java.utils.
// Linked list is used to store different types of data..
// Its can also store duplicate data...
// We can add any mo of null values...
// Its also follow insertion order...
// Its store data in indexing...
// LinkedList follow the structure of double
// LinkedList stored the data in form node...
// Note is a collection of two sub elements.

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList<Integer> linkList = new LinkedList<>();
        linkList.add(1);
        linkList.add(2);
        linkList.add(3);
        linkList.get(2); // time complicity 0(n)
        linkList.addLast(8); // time complicity 0(1)
        linkList.addFirst(0); // time complicity 0(1)
        linkList.getFirst();
        System.out.println(linkList.getLast());
        System.out.println(linkList);

        linkList.removeIf(x -> x%2 == 0);
        System.out.println(linkList);


    }
}