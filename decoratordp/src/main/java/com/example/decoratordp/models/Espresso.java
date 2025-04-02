package com.example.decoratordp.models;

public class Espresso extends Beverage {
    public Espresso() {
        beverageName = "Espresso";
    }

    @Override
    public double getBeveragePrice() {
        return 10.00;
    }

}
