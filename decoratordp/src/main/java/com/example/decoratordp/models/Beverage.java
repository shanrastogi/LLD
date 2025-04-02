package com.example.decoratordp.models;

public abstract class Beverage {
    String beverageName;

    public String getBeverageName() {
        return beverageName;
    }

    public abstract double getBeveragePrice();
}
