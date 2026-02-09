package com.engineeringdigest.corejava.accessSpecifier;

public class Student {

    public static int count = 0;

    Student() {
        count++;
    }

    static {
        System.out.println("HEllo");
    }

    private int id;

    private String name;

    private String age;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
