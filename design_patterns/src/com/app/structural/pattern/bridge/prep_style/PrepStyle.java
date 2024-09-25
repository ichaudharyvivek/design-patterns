package com.app.structural.pattern.bridge.prep_style;

import com.app.structural.pattern.bridge.pizza_types.Pizza;

public abstract class PrepStyle {
    protected Pizza pizza;

    protected PrepStyle(Pizza pizza) {
        this.pizza = pizza;
    }

    abstract void addSauce();

    abstract void addToppings();

    abstract void makeCrust();

    public void deliver() {
        makeCrust();
        addSauce();
        addToppings();
        this.pizza.assemble();
        this.pizza.qualityCheck();
        System.out.println("Order in Complete!");
    }

}
