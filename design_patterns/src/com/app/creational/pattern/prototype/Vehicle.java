package com.app.creational.pattern.prototype;

public abstract class Vehicle {
    private String brand;
    private String color;
    private String model;
    private int nTyres;

    protected Vehicle(String brand, String color, String model, int nTyres) {
        this.brand = brand;
        this.color = color;
        this.model = model;
        this.nTyres = nTyres;
    }

    protected Vehicle(Vehicle vh) {
        this.brand = vh.brand;
        this.color = vh.color;
        this.model = vh.model;
        this.nTyres = vh.nTyres;
    }

    public abstract Vehicle clone();

    @Override
    public String toString() {
        return "{ brand: " + this.brand +
                ", color: " + this.color +
                ", model: " + this.model +
                ", nTypes: " + nTyres + "}";
    }
}
