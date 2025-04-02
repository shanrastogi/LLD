package com.example.decoratordp.models;

public class Cappucino extends Beverage {
    public Cappucino() {
        beverageName = "Cappucino";
    }

    @Override
    public double getBeveragePrice() {
        return 13.50;
    }
}
