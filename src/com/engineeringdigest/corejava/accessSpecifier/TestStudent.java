package com.engineeringdigest.corejava.accessSpecifier;

public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();

        System.out.println(Student.count);
//        TestStudent obj = new TestStudent();
//        obj.sum(1,2);

        // direct call by class
        int res =  sum(5,8);
        System.out.println(res);

    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
