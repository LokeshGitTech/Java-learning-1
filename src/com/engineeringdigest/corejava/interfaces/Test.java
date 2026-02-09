package com.engineeringdigest.corejava.interfaces;

import com.engineeringdigest.corejava.interfaces.multipleInharitance.SmartPhone;

public class Test {
    public static void main(String[] args) {
//        Dogs dd= new Dogs();
//        dd.eat();
//
//        Cat cc= new Cat();
//        cc.sleep();
//
//        System.out.println(Dogs.MAX_AGE);
//
//        System.out.println(Animal.MAX_AGE);
//
//        Animal.service();
//
//        dd.start();

        SmartPhone smartPhone = new SmartPhone();
        smartPhone.makeCall("123456789");
        smartPhone.endCall();
        smartPhone.playMusic();
        smartPhone.stopMusic();
        smartPhone.takePhoto();
        smartPhone.recordVideo();

    }
}
