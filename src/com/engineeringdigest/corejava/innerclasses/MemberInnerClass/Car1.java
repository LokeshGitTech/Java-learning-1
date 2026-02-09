package com.engineeringdigest.corejava.innerclasses.MemberInnerClass;

public class Car1 {
    private  String model;

    private boolean isEngineOn;

    public boolean isEngineOn() {
        return isEngineOn;
    }

    public void setEngineOn(boolean engineOn) {
        isEngineOn = engineOn;
    }

    public Car1(String model) {
        this.model = model;
        this.isEngineOn = false;
    }

    public String getModel() {
        return model;
    }

    public class Engine {

    }
}
