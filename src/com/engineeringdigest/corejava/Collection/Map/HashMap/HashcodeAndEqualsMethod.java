package com.engineeringdigest.corejava.Collection.Map.HashMap;

import java.util.HashMap;
import java.util.Objects;

public class HashcodeAndEqualsMethod {
    public static void main(String[] args) {
        HashMap<Student , String> map = new HashMap<>();
        Student s1 = new Student("Alice", 1);
        Student s2 = new Student("Rahul", 2);
        Student s3 = new Student("Alice", 1);

        map.put(s1, "Engineer"); // hashcode1 ---> index1
        map.put(s2, "Designer"); // hashcode2 ---> index2
        map.put(s3, "Manager"); // hashcode1 ---> index1 --> equals --> replace

        System.out.println("Hash Size : " + map.size());
        System.out.println("Value for s1 : " + map.get(s1));
        System.out.println("Value for s3 : " + map.get(s3));
//        System.out.println(s1);
        System.out.println();


//        Map<String , Integer> map1 = new HashMap<>();
//        map1.put("Shubham", 90); // hashcode1 ---> index1
//        map1.put("Neha", 92); // hashcode2 ---> index2
//        map1.put("Shubham", 99);// hashcode1 ---> index1 ---> equals() --> replace
    }
}

class Student {
    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public boolean equals(Object obj) {
//        return super.equals(obj);
        if(this == obj){
            return true;
        }
        if(obj == null) {
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        Student other = (Student) obj;
        return id == other.getId() && Objects.equals(name, other.getName());
    }

    @Override
    public String toString() {
        return  "id : " + id + ", " + name;
    }

    public Student(String name, int id){
        this.name = name;
        this.id = id;
    }
}
