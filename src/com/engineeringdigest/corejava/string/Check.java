package com.engineeringdigest.corejava.string;

public class Check {
    public static void main(String[] args) {
        String s1 = "lalit";
        String s2 = "lalit";

        String s3 = new String("lalit");

        String s4 = s3;

//        System.out.println(s1.hashCode());
//        System.out.println(s2.hashCode());

        // == checks address where store string
//        System.out.println(s1==s2);
//        System.out.println(s1==s3);


        //   System.out.println(s3==s4);


        // equal method store a value.
//        System.out.println(s1.equals(s3));
    }
}
