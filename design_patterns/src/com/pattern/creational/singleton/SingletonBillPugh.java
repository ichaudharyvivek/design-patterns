package com.pattern.creational.singleton;

public class SingletonBillPugh {
	private SingletonBillPugh() {

	}

	private static class SingletonBillPughHelper {
		// Can implement it in any other way
		// Here used: Eager Implementation
		private static SingletonBillPugh instance = new SingletonBillPugh();
	}

	public static SingletonBillPugh getInstance() {
		return SingletonBillPughHelper.instance;
	}

}
