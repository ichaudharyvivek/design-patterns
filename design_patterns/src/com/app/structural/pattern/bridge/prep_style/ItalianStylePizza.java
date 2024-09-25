package com.app.structural.pattern.bridge.prep_style;

import com.app.structural.pattern.bridge.pizza_types.Pizza;

public class ItalianStylePizza extends PrepStyle {

    public ItalianStylePizza(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void addToppings() {
        super.pizza.setToppings("None");
    }

    @Override
    public void addSauce() {
        super.pizza.setSauce("Olive Oil");
    }

    @Override
    public void makeCrust() {
        super.pizza.setCrust("Thin");
    }

}
