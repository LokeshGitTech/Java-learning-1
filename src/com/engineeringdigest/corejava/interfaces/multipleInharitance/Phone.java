package com.engineeringdigest.corejava.interfaces.multipleInharitance;

public interface Phone {
    void makeCall(String number);

    void endCall();

     static void main(String[] args) {
        System.out.println("kya me interface ke andar main method likh sakte he ?");
    }

}
