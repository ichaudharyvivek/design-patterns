package com.app.creational.main;

import com.app.creational.pattern.factory.idiom.DatabaseClient;
import com.app.creational.pattern.factory.idiom.DatabaseFactory;

public class FactoryApp {
	public static void main(String[] args) {
		// This is not true factory, it is more of a rough structure called factory idiom
		DatabaseFactory df = new DatabaseFactory();
		DatabaseClient mongodb = df.getClient("mongodb");
		DatabaseClient mysql = df.getClient("mysql");

		mongodb.getMetaData();
		mongodb.executeQuery();

		mysql.getMetaData();
		mysql.executeQuery();

	}
}
