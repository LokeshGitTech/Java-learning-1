package com.engineeringdigest.corejava.oops.abstraction.Interface.objectOfInterface;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {

        Student s =new Student() {

            String name = "Ram";

            void study() {
                System.out.println("Studying");
            }

            void hello(){
                System.out.println("Hello method");
            }
        };

        s.study();
        s.m1();
//        s.hello();

        Method method = s.getClass().getDeclaredMethod("hello");
        method.invoke(s);

        Field field = s.getClass().getDeclaredField("name");
        System.out.println(field.get(s));

    }
}
