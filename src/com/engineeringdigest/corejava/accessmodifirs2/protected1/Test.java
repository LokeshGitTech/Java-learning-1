package com.engineeringdigest.corejava.accessmodifirs2.protected1;

import com.engineeringdigest.corejava.accessmodifiers.protected1.Student;

public class Test extends Student {

    public static void main(String[] args) {
        // when I try to access protected with using
        // a super class object it's not allow

        // Student ss = new Student();
        // System.out.println(ss.age);
        // ss.A();


        // For access protected var, method and constructor, we need to
        // create subclass in diff package and access by a sub.

        Test tt = new Test();
        tt.A();
        System.out.println(tt.age);
    }
}
