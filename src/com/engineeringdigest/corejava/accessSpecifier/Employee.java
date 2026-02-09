package com.engineeringdigest.corejava.accessSpecifier;

public class Employee {
    int id;

    String name;

    double salary;

    static  String companyName;

    // without creating object we can call or use static method.
    static void fun(){

    }

    // constructor : we can no make static constructor
    public Employee(int id, String name, double salary) {
//        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Compaly Name: " + companyName);
    }

    public static void main(String[] args) {
        Employee.companyName = "TCS";
        Employee employee = new Employee(101, "lalit", 30000);
        employee.display();

        System.out.println("==========================");

        Employee employee2 = new Employee(102, "Rahul", 45000);
        employee2.display();
    }

}
