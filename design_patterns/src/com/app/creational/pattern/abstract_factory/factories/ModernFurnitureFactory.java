package com.app.creational.pattern.abstract_factory.factories;

import com.app.creational.pattern.abstract_factory.chair.Chair;
import com.app.creational.pattern.abstract_factory.sofa.Sofa;
import com.app.creational.pattern.abstract_factory.table.Table;

import com.app.creational.pattern.abstract_factory.chair.ModernChair;
import com.app.creational.pattern.abstract_factory.sofa.ModernSofa;
import com.app.creational.pattern.abstract_factory.table.ModernTable;

public class ModernFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public Table createTable() {
        return new ModernTable();

    }

}
