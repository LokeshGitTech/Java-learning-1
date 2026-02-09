package com.engineeringdigest.corejava.Collection.List.VectorAndStack;
import java.util.Vector;   // ✅ missing import added


// Vector and stack are implements to the List interface...
// Vector is introduce in java 1.2 version
// Vector is the superclass of stack class

// Vector can store different type of data/duplicates data/insertion order
// it can store no of null value/follow indexing.

//

class AddTask extends Thread {
    Vector<Integer> vector;
    int start;

    AddTask(Vector<Integer> vector, int start) {
        this.vector = vector;
        this.start = start;
    }

    public void run() {
        for (int i = start; i < start + 1000; i++) {
            vector.add(i);
        }
    }
}

public class Test {
    public static void main(String[] args) throws InterruptedException {

        Vector<Integer> vector = new Vector<>();

        Thread t1 = new AddTask(vector, 0);
        Thread t2 = new AddTask(vector, 1000);

        t1.start();
        t2.start();

        // wait for both threads
        t1.join();
        t2.join();

        // only count
        System.out.println("Total count: " + vector.size());
    }
}
