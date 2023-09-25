package com.pattern.creational.abstract_factory.factories;

import com.pattern.creational.abstract_factory.chair.Chair;
import com.pattern.creational.abstract_factory.sofa.Sofa;
import com.pattern.creational.abstract_factory.table.Table;

import com.pattern.creational.abstract_factory.chair.VictorianChair;
import com.pattern.creational.abstract_factory.sofa.VictorianSofa;
import com.pattern.creational.abstract_factory.table.VictorianTable;

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
