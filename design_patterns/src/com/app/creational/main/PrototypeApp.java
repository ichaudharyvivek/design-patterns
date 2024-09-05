package com.app.creational.main;

import com.app.creational.pattern.prototype.*;

public class PrototypeApp {

	public static void NetworkExample() throws InterruptedException {
		NetworkConnection nc = new NetworkConnection();
		NetworkConnection cnc = null;

		System.out.println("Creating object data");
		nc.setIp("10:176.6.116");
		nc.loadData();
		System.out.println(nc);

		try {
			// Clone the object
			cnc = (NetworkConnection) nc.clone();
			System.out.println(cnc);

		} catch (CloneNotSupportedException ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Car bmwCar = new Car("BMW", "Black", "3XO", 4, 250);
		System.out.println(bmwCar.toString());

		Car newBmwCar = (Car) bmwCar.clone();
		System.out.println(newBmwCar.toString());
	}
}
