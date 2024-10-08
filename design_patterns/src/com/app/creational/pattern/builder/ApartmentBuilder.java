package com.app.creational.pattern.builder;

public class ApartmentBuilder {
	private int sqm = -1;
	private int rooms = -1;
	private String city = "";
	private String area = "";
	private boolean kitchen = false;

	public ApartmentBuilder setSqm(int sqm) {
		this.sqm = sqm;
		return this;
	}

	public ApartmentBuilder setRooms(int rooms) {
		this.rooms = rooms;
		return this;
	}

	public ApartmentBuilder setCity(String city) {
		this.city = city;
		return this;
	}

	public ApartmentBuilder setArea(String area) {
		this.area = area;
		return this;
	}

	public ApartmentBuilder setKitchen(boolean kitchen) {
		this.kitchen = kitchen;
		return this;
	}

	// After building the object with setters,
	// build method can be used to instantiate the object
	public Apartment build() {
		Apartment ap = new Apartment(sqm, rooms, city, area, kitchen);

		sqm = 0;
		rooms = 0;
		city = "";
		area = "";
		kitchen = false;

		return ap;
	}

}
