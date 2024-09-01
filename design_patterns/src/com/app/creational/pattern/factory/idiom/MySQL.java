package com.app.creational.pattern.factory.idiom;

public class MySQL implements DatabaseClient {

	@Override
	public void getMetaData() {
		System.out.println("MySQL Database Initiated");
	}

	@Override
	public void executeQuery() {
		System.out.println("Executing query in MySQL...");
	}

}
