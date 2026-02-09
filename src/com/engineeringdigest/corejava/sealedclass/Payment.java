package com.engineeringdigest.corejava.sealedclass;


// Sealed class properties can not be access any other classes without
// added permission to access and child class should be final.

// used a sealed and permits keyword for restrict.

public sealed class Payment permits Gpay, CreadiCardpayment {

    double a= 400;

}
