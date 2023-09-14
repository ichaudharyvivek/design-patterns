package com.app.creational.main;

import com.pattern.creational.factory.*;

public class FactoryApp {
	public static void main(String[] args) {
		DatabaseFactory df = new DatabaseFactory();

		DatabaseClient mongodb = df.getClient("mongodb");
		DatabaseClient mysql = df.getClient("mysql");

		mongodb.getMetaData();
		mongodb.executeQuery();

		mysql.getMetaData();
		mysql.executeQuery();

	}
}
