package com.app.creational.pattern.singleton;

public class SingletonStatic {
	private static SingletonStatic instance;

	private SingletonStatic() {

	}

	static {
		instance = new SingletonStatic();
	}

	public static SingletonStatic getInstance() {
		return instance;
	}
}
