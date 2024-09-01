package com.app.creational.pattern.factory.impl;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering WINDOWS button.");
    }

    @Override
    public void onClick(String action) {
        System.out.println("Clicking action: " + action + " on WINDOWS button.");
    }
}
