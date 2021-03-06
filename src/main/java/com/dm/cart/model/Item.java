package com.dm.cart.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Item {

    @JsonProperty("name")
    private String name;

    @JsonProperty("color")
    private String color;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
