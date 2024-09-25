package com.app.structural.pattern.bridge.prep_style;

import com.app.structural.pattern.bridge.pizza_types.Pizza;

public class AmericanStylePizza extends PrepStyle {

    public AmericanStylePizza(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void addToppings() {
        super.pizza.setToppings("Everything");
    }

    @Override
    public void addSauce() {
        super.pizza.setSauce("Super Secret Recipe");
    }

    @Override
    public void makeCrust() {
        super.pizza.setCrust("Thick");
    }
}
