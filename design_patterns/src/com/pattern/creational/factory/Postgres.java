package com.pattern.creational.factory;

public class Postgres implements DatabaseClient {

	@Override
	public String getMetaData() {
		return "Postgres Database Initiated";
	}
	
	@Override
	public void executeQuery() {
		System.out.println("Executing query in Postgres...");
	}

}
