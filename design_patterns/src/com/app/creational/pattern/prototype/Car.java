package com.app.creational.pattern.prototype;

public class Car extends Vehicle {
    private int topSpeed;

    public Car(String brand, String color, String model, int nTyres, int topSpeed) {
        super(brand, color, model, nTyres);
        this.topSpeed = topSpeed;
    }

    public Car(Car car) {
        super(car);
        this.topSpeed = car.topSpeed;
    }

    @Override
    public Vehicle clone() {
        return new Car(this);
    }

    @Override
    public String toString() {
        return super.toString().substring(0, super.toString().length() - 1)
                + ", topSpeed: " + this.topSpeed + "}";
    }
}
