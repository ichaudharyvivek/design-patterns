package com.app.structural.main;

import com.app.structural.pattern.adapter.data.XMLData;
import com.app.structural.pattern.adapter.legacy.MultiRestoApp;
import com.app.structural.pattern.adapter.newSDK.FancyUIServiceAdapter;

public class AdapterApp {
	public static void main(String[] args) {
		MultiRestoApp app = new MultiRestoApp();
		app.displayData(XMLData.getData());
		app.showRecommended(XMLData.getData());

		System.out.println();

		FancyUIServiceAdapter newApp = new FancyUIServiceAdapter();
		newApp.displayData(XMLData.getData());
		newApp.showRecommended(XMLData.getData());
	}
}
