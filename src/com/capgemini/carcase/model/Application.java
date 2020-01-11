package com.capgemini.carcase.model;

public class Application {
    public static void main(String[] args) {
        Car car1 = new Car();
        double mileage= car1.drive();
        System.out.println(mileage);
    }

}
