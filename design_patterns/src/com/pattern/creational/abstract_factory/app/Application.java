package com.pattern.creational.abstract_factory.app;

import com.pattern.creational.abstract_factory.chair.Chair;
import com.pattern.creational.abstract_factory.sofa.Sofa;
import com.pattern.creational.abstract_factory.table.Table;

import com.pattern.creational.abstract_factory.factories.FurnitureFactory;

public class Application {
    Chair chair;
    Sofa sofa;
    Table table;

    public Application(FurnitureFactory factory) {
        chair = factory.createChair();
        sofa = factory.createSofa();
        table = factory.createTable();
    }

    public void createFurniture() {
        chair.watch();
        sofa.relax();
        table.eat();
    }
}
