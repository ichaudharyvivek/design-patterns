package com.pattern.creational.abstract_factory.factories;

import com.pattern.creational.abstract_factory.chair.Chair;
import com.pattern.creational.abstract_factory.sofa.Sofa;
import com.pattern.creational.abstract_factory.table.Table;

public interface FurnitureFactory {
    Chair createChair();

    Sofa createSofa();

    Table createTable();
}
