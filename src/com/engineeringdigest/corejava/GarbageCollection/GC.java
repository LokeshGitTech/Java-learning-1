package com.engineeringdigest.corejava.GarbageCollection;

import java.lang.ref.WeakReference;

public class GC {
    public static void main(String[] args) {
//        WeakReferance phoneWeakReferance = new WeakReferance("Apple", "16 pro max");
//        System.out.println(phoneWeakReferance);
        WeakReference<Phone> phoneWeakReference = new WeakReference<>(new Phone("Apple", "16 pro max"));
        System.out.println(phoneWeakReference.get());
        System.gc();
        try{
            Thread.sleep(10000);
        } catch (Exception ignored) {

        }

        System.out.println(phoneWeakReference.get());


    }
}

class Phone{
    String brand;
    String model;

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
}
