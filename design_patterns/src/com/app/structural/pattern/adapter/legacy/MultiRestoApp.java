package com.app.structural.pattern.adapter.legacy;

import java.util.List;
import com.app.structural.pattern.adapter.data.XMLData;

public class MultiRestoApp implements IMultiRestoApp {

    @Override
    public void displayData(List<XMLData> data) {
        System.out.println("Printing data in XML format: ");
        for (XMLData e : data) {
            System.out.println(e.toString());
        }
    }

    @Override
    public void showRecommended(List<XMLData> data) {
        System.out.println("Printing recommended data in XML format");
        for (XMLData e : data) {
            System.out.println(e.toString());
        }
    }

}
