package com.engineeringdigest.corejava.interfaces.multipleInharitance;


// Multiple inheritance achieve by interfaces.
public class SmartPhone implements  Camera, MusicPlayer, Phone {

    @Override
    public void takePhoto() {
        System.out.println("Photo liya....");
    }

    @Override
    public void recordVideo() {
        System.out.println("REcord kiya");
    }

    @Override
    public void playMusic() {

    }

    @Override
    public void stopMusic() {

    }

    @Override
    public void makeCall(String number) {

    }

    @Override
    public void endCall() {

    }
}
