package com.pattern.creational.factory;

public class MySQL implements DatabaseClient {

	@Override
	public String getMetaData() {
		return "MySQL Database Initiated";
	}

}
