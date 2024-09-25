package com.app.structural.pattern.bridge.pizza_types;

public abstract class Pizza {
    protected String crust;
    protected String sauce;
    protected String toppings;

    public abstract void assemble();

    public abstract void qualityCheck();

    // No Lombok hence manual
    public String getCrust() {
        return crust;
    }

    public void setCrust(String crust) {
        this.crust = crust;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }
}
