package com.app.creational.main;

import com.app.creational.pattern.prototype.*;

public class PrototypeApp {
	public static void main(String[] args) throws InterruptedException {
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
}
