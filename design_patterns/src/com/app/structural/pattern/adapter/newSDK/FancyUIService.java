package com.app.structural.pattern.adapter.newSDK;

import java.util.List;
import com.app.structural.pattern.adapter.data.JsonData;

public class FancyUIService {
    public void displayData(List<JsonData> data) {
        System.out.println("Printing data in JSON format: ");
        for (JsonData e : data) {
            System.out.println(e.toString());
        }
    }

    public void showRecommended(List<JsonData> data) {
        System.out.println("Printing recommended data in JSON format");
        for (JsonData e : data) {
            System.out.println(e.toString());
        }
    }
}
