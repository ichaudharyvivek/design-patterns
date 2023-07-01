package com.pattern.creational.factory;

public class Postgres implements DatabaseClient {

	@Override
	public String getMetaData() {
		return "Postgres Database Initiated";
	}

}
