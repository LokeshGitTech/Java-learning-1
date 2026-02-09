package com.engineeringdigest.corejava.innerclasses.MemberInnerClass;

public class Car {

    private String model;
    private boolean isEngineOn;

    public Car(String modal){
        this.model = modal;
        this.isEngineOn = false;
    }

     class Engine {
        void start() {
            if (!isEngineOn) {
                isEngineOn = true;
                System.out.println(model + " engine stared.");
            } else {
                System.out.println(model + " engine is already on.");
            }
        }

        void stop(){
            if(isEngineOn){
                isEngineOn = false;
                System.out.println(model + "  engine stopped.");
            } else {
                System.out.println(model + " engine already off.");
            }
        }
    }
}
