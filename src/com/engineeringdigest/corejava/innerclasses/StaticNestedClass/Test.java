package com.engineeringdigest.corejava.innerclasses.StaticNestedClass;

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer("Dell", "AX471", "ASDF");
        computer.getOs().displayInfo();

        Computer.USB usb1= new Computer.USB("Type-c");

    }
}
