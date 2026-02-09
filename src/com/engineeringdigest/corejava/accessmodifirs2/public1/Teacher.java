package com.engineeringdigest.corejava.accessmodifirs2.public1;

import com.engineeringdigest.corejava.accessmodifiers.public1.Student;

public class Teacher {
    public static void main(String[] args) {
        Student ss =new Student(8); // public constructor also access in other package
        System.out.println(ss.xx);

        ss.xxMethod(); // access in other packages also

    }
}
