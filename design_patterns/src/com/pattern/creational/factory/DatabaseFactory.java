package com.pattern.creational.factory;

public class DatabaseFactory {
	private static DatabaseClient typeOfInstance;

	private DatabaseFactory() {

	}

	public static DatabaseClient getClient(String dbname) {
		if (dbname == null)
			return null;

		if (dbname.equalsIgnoreCase("mongodb")) {
			typeOfInstance = new MongoDB();

		} else if (dbname.equalsIgnoreCase("postgres")) {
			typeOfInstance = new Postgres();

		} else if (dbname.equalsIgnoreCase("mysql")) {
			typeOfInstance = new MySQL();

		} else {
			throw new IllegalArgumentException("Invalid database type.");

		}

		return typeOfInstance;
	}
}
