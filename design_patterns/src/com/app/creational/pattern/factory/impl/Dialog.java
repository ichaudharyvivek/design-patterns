package com.app.creational.pattern.factory.impl;

public abstract class Dialog {
    public abstract Button createButton();

    public void render() {
        Button okButton = this.createButton();
        okButton.render();
        okButton.onClick("Close Dialog");
    }
}
