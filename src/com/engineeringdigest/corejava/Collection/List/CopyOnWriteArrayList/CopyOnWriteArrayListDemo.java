package com.engineeringdigest.corejava.Collection.List.CopyOnWriteArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Iterator> list = new CopyOnWriteArrayList<>();
        // "Copy on Write" means that whenever a write operation
        // like adding or removing an element instead of directly the existing list
        // a new copy of that the list is created, and modification is applied to that copy
        // this ensures that other threads reading the list while it's being modified are unaffected.


        // Read Operation:  Fast and direct, since they happen on a stable list without interface from modifications.
        // Write Operations: A new copy of the list is created for every modification.
        // The reference to the list is then updated so that subsequent reads use new list.

        // EX: notepad --> notepad-copy

        // When used: Read more and write less

        List<String> shoppingList = new CopyOnWriteArrayList<>();
        shoppingList.add("Milk");
        shoppingList.add("Eggs");
        shoppingList.add("Bread");
        shoppingList.add("Banana");

        for (String n : shoppingList) {
            System.out.println(n);

            // Try to modify the list while reading
            if (n.equals("Eggs")) {
                shoppingList.add("Butter");
                System.out.println("Added Butter while reading.");
            }
        }

        // purani = new wali
        System.out.println("Updated shoppingf List: " + shoppingList);

    }
}
