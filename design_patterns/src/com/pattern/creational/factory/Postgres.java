package com.pattern.creational.factory;

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
