package com.app.creational.pattern.factory;

public class Postgres implements DatabaseClient {

	@Override
	public void getMetaData() {
		System.out.println("Postgres Database Initiated");
	}

	@Override
	public void executeQuery() {
		System.out.println("Executing query in Postgres...");
	}

}
