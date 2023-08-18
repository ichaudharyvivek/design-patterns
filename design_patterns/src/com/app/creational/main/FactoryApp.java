package com.app.creational.main;

import com.pattern.creational.factory.*;

public class FactoryApp {
	public static void main(String[] args) {

		DatabaseClient mongodb = DatabaseFactory.getClient("mongodb");
		DatabaseClient mysql = DatabaseFactory.getClient("mysql");

		mongodb.executeQuery();
		mysql.executeQuery();

		System.out.println(mongodb.getMetaData());
		System.out.println(mysql.getMetaData());

	}
}
