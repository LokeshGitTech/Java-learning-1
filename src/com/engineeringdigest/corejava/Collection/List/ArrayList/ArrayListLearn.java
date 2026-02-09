package com.engineeringdigest.corejava.Collection.List.ArrayList;

import java.util.ArrayList;
// ArrayList is a class which is used to implements list interface present in java,utils package.
// ArrayList can store different types of data
// ArrayList can store duplicated data also
// ArrayList is a index base data structure.
// ArrayList follows insertion order...
// ArrayList can store number of null elements.
// ArrayList is created on the bases of growable and shrinkable array ....
// ArrayList extends to the AbstractList class.

// ArrayList good for retrieval (get) operations.
// ArrayList not good for insertion and deletion.

public class ArrayListLearn {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);

        list.add(1);
        list.add(5);
        list.add(56);
        list.add(8);
        list.add(9);
        list.add(8);

        System.out.println(list.size());
        System.out.println(list.get(0));

//        System.out.println(list.get(3));
//        System.out.println(list.size());
//        System.out.println(list.size());
//
//        for(int i =0; i<list.size(); i++ ){
//            System.out.println(list.get(i));
//        }
//
//        for(int x: list){
//            System.out.println(x);
//        }


        // Check  in list exist a items or not.
//        System.out.println(list.contains(5));
//        System.out.println(list.contains(9));

        // for remove any item form particular index.
//        list.remove(2);
//        System.out.println(list.size());

        // insert item on any particular index.
//        list.add(2 , 99);
//        for(int x: list){
//            System.out.println(x);
//        }


        // replace particular item using a index
//        list.set(2 , 101);
//        for(int x: list) {
//            System.out.println(x);
//        }

        // if we print list its convert in string like [1,5,56,8]
//        System.out.println(list);



    }
}
