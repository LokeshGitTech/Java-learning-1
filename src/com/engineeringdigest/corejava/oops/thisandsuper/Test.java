package com.engineeringdigest.corejava.oops.thisandsuper;

public class Test extends Demo {

    int id;
    String name;

     void set() {
         // call parent class instance variable
         super.id = 101;
         super.name = "Abhay";

         // call same class instance variable
         this.id = 102;
         this.name = "Sachin";

         // call parent instance class method
         super.show();

         // Try to call static variable : Not recorded
//          super.apple = "banana";
//          System.out.println(super.apple);

          // Call by direct call
         System.out.println(Demo.apple);
         System.out.println(Test.apple);

     }

    public static void main(String[] args) {
        Test t = new Test();
        t.set();

    }
}
