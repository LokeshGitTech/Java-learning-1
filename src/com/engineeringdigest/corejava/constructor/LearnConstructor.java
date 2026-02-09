package com.engineeringdigest.corejava.constructor;

public class LearnConstructor {
    private LearnConstructor() {
        System.out.println("I am a Constroctur");
    }

    void add() {
        System.out.println("Hiiii");
    }


    public static void main(String[] args) {
        // We can not create a object with class constructor have private.
        // PrivateConstructor pp = new PrivateConstructor();

        LearnConstructor a = new LearnConstructor();

        a.add();
        a.add();
        a.add();

        LearnConstructor b = new LearnConstructor();
        b.add();
        b.add();

        LearnConstructor c = new LearnConstructor();
    }
}
