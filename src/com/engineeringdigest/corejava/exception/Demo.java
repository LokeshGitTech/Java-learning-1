package com.engineeringdigest.corejava.exception;

import java.util.Scanner;

public class Demo {
   void checkAge() {
       int age;
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter Age:   ");

       age=sc.nextInt();

       try {
           if (age < 18) {
               throw new YoungerAgeException("Aap ki age kam he.....");
           } else {
               System.out.println("you can vote...");
           }
       } catch(YoungerAgeException e) {
           System.out.println(e.getMessage());
       }
   }

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.checkAge();
    }
}
