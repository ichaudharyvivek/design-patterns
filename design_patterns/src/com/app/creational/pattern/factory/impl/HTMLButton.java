package com.app.creational.pattern.factory.impl;

public class HTMLButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering HTML button.");
    }

    @Override
    public void onClick(String action) {
        System.out.println("Clicking action: " + action + " on HTML button.");
    }
}
