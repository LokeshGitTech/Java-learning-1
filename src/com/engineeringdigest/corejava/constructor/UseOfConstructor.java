package com.engineeringdigest.corejava.constructor;

public class UseOfConstructor {

    int id; // var declare   , its instance because its inside method and not have static.
    String name;

    UseOfConstructor(int eid, String ename){
        id = eid;
        name = ename;
        System.out.println(eid + "    " +  ename);
    }

    public static void main(String[] args) {
        UseOfConstructor a = new UseOfConstructor(101, "Lokesh");
        UseOfConstructor b = new UseOfConstructor(102, "Rahul");
        UseOfConstructor c = new UseOfConstructor(103, "Sagar");
    }
}
