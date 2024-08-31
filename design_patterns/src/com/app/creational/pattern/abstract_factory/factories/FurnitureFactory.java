package com.app.creational.pattern.abstract_factory.factories;

import com.app.creational.pattern.abstract_factory.chair.Chair;
import com.app.creational.pattern.abstract_factory.sofa.Sofa;
import com.app.creational.pattern.abstract_factory.table.Table;

public interface FurnitureFactory {
    Chair createChair();

    Sofa createSofa();

    Table createTable();
}
