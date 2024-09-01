package com.app.creational.main;

import com.app.creational.pattern.factory.idiom.*;
import com.app.creational.pattern.factory.impl.Dialog;
import com.app.creational.pattern.factory.impl.WebDialog;
import com.app.creational.pattern.factory.impl.WindowsDialog;

public class FactoryApp {
	private static Dialog dialog;

	public static void initialize(String type) throws Exception {
		if (type == "windows") {
			dialog = new WindowsDialog();
		} else if (type == "web") {
			dialog = new WebDialog();
		} else {
			throw new Exception("Error!");
		}
	}

	public static void main(String[] args) throws Exception {
		// This is not true factory, its a rough structure called factory idiom
		// DatabaseFactory df = new DatabaseFactory();
		// DatabaseClient mongodb = df.getClient("mongodb");
		// DatabaseClient mysql = df.getClient("mysql");

		// mongodb.getMetaData();
		// mongodb.executeQuery();
		// mysql.getMetaData();
		// mysql.executeQuery();s

		// True factory implementation
		System.out.println("\n");
		initialize("web");
		dialog.render();
	}
}
