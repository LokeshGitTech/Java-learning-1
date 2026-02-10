package com.engineeringdigest.corejava.Collection.Map.HashTable;
import java.util.HashMap;
import java.util.Hashtable;

public class HashtableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String > hashtable = new Hashtable<>();
        // Hashtable is synchronized
        // no null key or value
        // slower than HashMap

        hashtable.put(1, "Apple");
        hashtable.put(2, "Banana");
        hashtable.put(3, "Cherry");

//        System.out.println(hashtable);
//        System.out.println("Value for key 2: " + hashtable.get(2));

        // In hashtable should nopt have key and value null.
//        hashtable.put(null, "value"); // Throw exception
//        hashtable.put(4, null); // Throw exception

        Hashtable<Integer, String> map = new Hashtable<>();

        Thread thread1 = new Thread(() -> {
            for (int i=0; i < 2000; i++){
                map.put(i, "Thread1");
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i=0; i < 2000; i++){
                map.put(i, "Thread2");
            }
        });
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Final size of HashMap: " + map.size());
    }
}
