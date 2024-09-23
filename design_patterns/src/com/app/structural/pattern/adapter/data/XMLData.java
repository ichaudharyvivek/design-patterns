package com.app.structural.pattern.adapter.data;

import java.util.ArrayList;
import java.util.List;

public class XMLData {
    private int id;
    private String name;
    private String location;

    public XMLData(int id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public static List<XMLData> getData() {
        List<XMLData> list = new ArrayList<>();
        list.add(new XMLData(1, "Udupi", "Nerul"));
        list.add(new XMLData(2, "Prithvish", "Sanpada"));
        list.add(new XMLData(3, "Pranaam", "Belapur"));
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

    @Override
    public String toString() {
        return "XMLData [id=" + id + ", name=" + name + ", location=" + location + "]";
    }

}
