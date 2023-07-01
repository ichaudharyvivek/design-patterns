package com.pattern.creational.builder;

public class Apartment {
	private int sqm;
	private int rooms;
	private String city;
	private String area;
	private boolean kitchen;

	public Apartment(int sqm, int rooms, String city, String area, boolean kitchen) {
		super();
		this.sqm = sqm;
		this.rooms = rooms;
		this.city = city;
		this.area = area;
		this.kitchen = kitchen;
	}

	public int getSqm() {
		return sqm;
	}

	public void setSqm(int sqm) {
		this.sqm = sqm;
	}

	public int getRooms() {
		return rooms;
	}

	public void setRooms(int rooms) {
		this.rooms = rooms;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public boolean isKitchen() {
		return kitchen;
	}

	public void setKitchen(boolean kitchen) {
		this.kitchen = kitchen;
	}

	@Override
	public String toString() {
		String ap = "Apartment { ";

		if (sqm != -1)
			ap += " sqm: " + sqm;

		if (rooms != -1)
			ap += ", rooms: " + rooms;

		if (!city.isEmpty())
			ap += ", city: " + city;

		if (!area.isEmpty())
			ap += ", area: " + area;

		if (kitchen || !kitchen)
			ap += ", kitchen: " + kitchen;

		ap += " }";
		
		return ap;
	}

}
