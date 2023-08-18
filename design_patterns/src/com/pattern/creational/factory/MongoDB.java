package com.pattern.creational.factory;

public class MongoDB implements DatabaseClient {

	@Override
	public String getMetaData() {
		return "MongoDB Database Initiated";
	}

	@Override
	public void executeQuery() {
		System.out.println("Executing query in MongoDB...");
	}

}
