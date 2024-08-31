package com.app.creational.pattern.abstract_factory.factories;

import com.app.creational.pattern.abstract_factory.chair.Chair;
import com.app.creational.pattern.abstract_factory.sofa.Sofa;
import com.app.creational.pattern.abstract_factory.table.Table;

import com.app.creational.pattern.abstract_factory.chair.ArtDecoChair;
import com.app.creational.pattern.abstract_factory.sofa.ArtDecoSofa;
import com.app.creational.pattern.abstract_factory.table.ArtDecoTable;

public class ArtDecoFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new ArtDecoChair();
    }

    @Override
    public Sofa createSofa() {
        return new ArtDecoSofa();
    }

    @Override
    public Table createTable() {
        return new ArtDecoTable();
    }

}
