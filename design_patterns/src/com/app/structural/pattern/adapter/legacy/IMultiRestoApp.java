package com.app.structural.pattern.adapter.legacy;

import java.util.List;
import com.app.structural.pattern.adapter.data.XMLData;

public interface IMultiRestoApp {
    public void displayData(List<XMLData> data);

    public void showRecommended(List<XMLData> data);

}