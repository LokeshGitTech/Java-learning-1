package com.engineeringdigest.corejava.accessmodifiers.public1;


// Public access modifir will tell us we can access class member within class,
// outside class and outside package also.


// Private : It will tell us we can access class member within same class only...
// we can create a variable, method, constructor are private but the other class we can not make a private.


public class Student {

    public  Student(int a) {
        System.out.println("Haa constructor access");
    }

    public int xx = 8;

    public void xxMethod() {
        System.out.println("xxMethod");
    }

    public static void main(String[] args) {
        Student myclassobjest = new Student(2);

        System.out.println(myclassobjest.xx);
        myclassobjest.xxMethod(); // access in same class
    }

}
