package com.app.structural.main;

import com.app.structural.pattern.bridge.pizza_types.*;
import com.app.structural.pattern.bridge.prep_style.*;

public class BridgeApp {
    public static void main(String[] args) {
        AmericanStylePizza asp = new AmericanStylePizza(new PepperoniPizza());
        asp.deliver();

        System.out.println("==========================================\n");

        ItalianStylePizza isp = new ItalianStylePizza(new FarmhousePizza());
        isp.deliver();
    }
}
