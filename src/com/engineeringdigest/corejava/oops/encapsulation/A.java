package com.engineeringdigest.corejava.oops.encapsulation;

public class A {

    public static void main(String[] args) {
        Demo d = new Demo();

        d.setId(100);
        System.out.println(d.getId());

        d.setName("lalit");

        d.setBankAccountNumber("12345678");
        System.out.println(d.getBankAccountNumber());

        System.out.println(d.getName());
    }
}
