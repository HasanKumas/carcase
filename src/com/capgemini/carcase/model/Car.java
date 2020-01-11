package com.capgemini.carcase.model;


public class Car {
    double mileage;
    Wheel wheel1 = new Wheel();

    String wheelType = wheel1.wheelType;
    int wheelSize = wheel1.wheelSize;
    public double drive(){
        mileage = mileage+1;
        wheelType = "Summer";
        return mileage;
    }
}
