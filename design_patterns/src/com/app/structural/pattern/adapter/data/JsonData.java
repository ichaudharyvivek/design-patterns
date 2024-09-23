package com.app.structural.pattern.adapter.data;

import java.util.ArrayList;
import java.util.List;

public class JsonData {
    private int id;
    private String name;
    private String location;
    private String country;

    public JsonData(int id, String name, String location, String country) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.country = country;
    }

    public List<JsonData> getData() {
        List<JsonData> list = new ArrayList<>();
        list.add(new JsonData(1, "Udupi", "Nerul", "India"));
        list.add(new JsonData(2, "Prithvish", "Sanpada", "India"));
        list.add(new JsonData(3, "Pranaam", "Belapur", "India"));
        return list;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "JsonData [id=" + id + ", name=" + name + ", location=" + location + ", country=" + country + "]";
    }

}
