package com.engineeringdigest.corejava.innerclasses.AnonymousInnerClass;

// No class name is given.
// Typically used to override methods or implement interfaces.
// Defined inline while creating an object.

public class Test {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart(150);
//        CreditCard creditCard = new CreditCard("12345678");


        // Anonymous inner class.
        // Jb hame koi interfacen ka class banaye bina use implement karana ho tab ham anonymous inner class use kar sakte he.
        shoppingCart.processPayment(new Payment() {
            @Override
            public void pay(double amount) {
                System.out.println("Paid " + amount + "using Credit Card.");
            }
        });

    }
}
