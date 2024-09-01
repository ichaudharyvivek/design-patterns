package com.app.creational.pattern.factory.idiom;

public class MongoDB implements DatabaseClient {

	@Override
	public void getMetaData() {
		System.out.println("MongoDB Database Initiated");
	}

	@Override
	public void executeQuery() {
		System.out.println("Executing query in MongoDB...");
	}

}
