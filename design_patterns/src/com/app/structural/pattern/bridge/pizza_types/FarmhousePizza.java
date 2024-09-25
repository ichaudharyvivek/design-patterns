package com.app.structural.pattern.bridge.pizza_types;

public class FarmhousePizza extends Pizza {

    @Override
    public void assemble() {
        System.out.println("-- Crust: " + super.crust);
        System.out.println("-- Sauce: " + super.sauce);
        System.out.println("-- Toppings: " + super.toppings);
        System.out.println("-- Added Vegetable and Cheese for Farmhouse Pizza");
    }

    @Override
    public void qualityCheck() {
        System.out.println("\n[Quality Check] Success");
    }

}
