package com.pattern.creational.abstract_factory.factories;

import com.pattern.creational.abstract_factory.chair.Chair;
import com.pattern.creational.abstract_factory.sofa.Sofa;
import com.pattern.creational.abstract_factory.table.Table;

import com.pattern.creational.abstract_factory.chair.ModernChair;
import com.pattern.creational.abstract_factory.sofa.ModernSofa;
import com.pattern.creational.abstract_factory.table.ModernTable;

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
