package com.app.structural.pattern.adapter.newSDK;

import java.util.List;
import java.util.stream.Collectors;

import com.app.structural.pattern.adapter.data.JsonData;
import com.app.structural.pattern.adapter.data.XMLData;
import com.app.structural.pattern.adapter.legacy.IMultiRestoApp;

public class FancyUIServiceAdapter implements IMultiRestoApp {
    private FancyUIService uiService;

    public FancyUIServiceAdapter() {
        this.uiService = new FancyUIService();
    }

    @Override
    public void displayData(List<XMLData> data) {
        List<JsonData> convertedData = data.stream().map(t -> convertToJSON(t)).collect(Collectors.toList());
        uiService.displayData(convertedData);
    }

    @Override
    public void showRecommended(List<XMLData> data) {
        List<JsonData> convertedData = data.stream().map(t -> convertToJSON(t)).collect(Collectors.toList());
        uiService.showRecommended(convertedData);
    }

    private static JsonData convertToJSON(XMLData data) {
        return new JsonData(data.getId(), data.getName(), data.getLocation(), "India");
    }
}
