package com.app.structural.pattern.bridge.pizza_types;

public class PaneerPizza extends Pizza {

    @Override
    public void assemble() {
        System.out.println("-- Crust: " + super.crust);
        System.out.println("-- Sauce: " + super.sauce);
        System.out.println("-- Toppings: " + super.toppings);
        System.out.println("-- Added Paneer and Indian Spices for Panner Pizza");
    }

    @Override
    public void qualityCheck() {
        System.out.println("\n[Quality Check] Success");
    }

}
