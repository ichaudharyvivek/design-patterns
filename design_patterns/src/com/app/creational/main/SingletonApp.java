package com.app.creational.main;

import com.app.creational.pattern.singleton.*;;

public class SingletonApp {
	public static void main(String[] args) {
		// SingletonEager ins1 = SingletonEager.getInstance();
		// SingletonEager ins2 = SingletonEager.getInstance();

		// SingletonStatic ins1 = SingletonStatic.getInstance();
		// SingletonStatic ins2 = SingletonStatic.getInstance();

		// SingletonLazy ins1 = SingletonLazy.getInstance();
		// SingletonLazy ins2 = SingletonLazy.getInstance();

		// SingletonThreadSafe ins1 = SingletonThreadSafe.getInstance();
		// SingletonThreadSafe ins2 = SingletonThreadSafe.getInstance();

		SingletonBillPugh ins1 = SingletonBillPugh.getInstance();
		SingletonBillPugh ins2 = SingletonBillPugh.getInstance();

		System.out.println(ins1);
		System.out.println(ins2);
	}
}
