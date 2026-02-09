package com.engineeringdigest.corejava.Collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListLearn2 {
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();

        // add(Object o) => return boolean => to add element
        a1.add(10);
        a1.add("Lp");
        a1.add("ram");
        a1.add(true);
        a1.add('c');
        a1.add(null);
        a1.add(null);
        a1.add(null);
        a1.add("Lalit");

        System.out.println(a1);

        // take a parameter is index and give that element
//        System.out.println(a1.get(1));

        // set replace value  not a add new one.
        a1.set(0, 20);
//        System.out.println(a1);

        // remove: takes index => return object jop remove hua
        // remove: takes(object o) => return boolean
        a1.remove(0);
//        System.out.println(a1);

        a1.remove("Lalit");
//        System.out.println(a1);

        // clear
//        a1.clear();
//        System.out.println(a1);

        // isEmpty >> check empty or not.

        Iterator list = a1.iterator();
        while(list.hasNext()) {
            System.out.println(list.next());
        }


    }
}
