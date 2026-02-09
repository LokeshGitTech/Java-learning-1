package com.engineeringdigest.corejava.interfaces.animal;

public interface Animal {

    int MAX_AGE = 150;

    public abstract void eat();

    void sleep();


    //
    default void start() {
        System.out.println("Animal starting");
        this.eat();
    }

    //
    static void service() {
        System.out.println("Animal serviced");
    }

    private void log() {
        System.out.println("Logging");
    }
}
