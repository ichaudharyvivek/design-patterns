package com.app.creational.main;

import com.pattern.creational.builder.*;

public class BuilderApp {
	public static void main(String[] args) {
		ApartmentBuilder ap = new ApartmentBuilder();
		
		Apartment mumbaiHouse = ap.setSqm(300).setRooms(2).setArea("Nala Sopara Sec 04").setCity("Mumbai").build();
		System.out.println(mumbaiHouse);
		
		Apartment miamiHouse = ap.setSqm(6400).setRooms(11).setArea("13C Paradise road, Beverly Hills").setCity("Miami").build();
		System.out.println(miamiHouse);
	}
}
