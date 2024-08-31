package com.app.creational.pattern.abstract_factory.factories;

import com.app.creational.pattern.abstract_factory.chair.Chair;
import com.app.creational.pattern.abstract_factory.sofa.Sofa;
import com.app.creational.pattern.abstract_factory.table.Table;

import com.app.creational.pattern.abstract_factory.chair.VictorianChair;
import com.app.creational.pattern.abstract_factory.sofa.VictorianSofa;
import com.app.creational.pattern.abstract_factory.table.VictorianTable;

public class VictorianFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }

    @Override
    public Table createTable() {
        return new VictorianTable();
    }

}
