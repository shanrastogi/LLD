package com.example.decoratordp.models;

public class Milk extends IngredientDecorator {
    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getBeverageName() {
        return beverage.getBeverageName() + ", Milk";
    }

    @Override
    public double getBeveragePrice() {
        return beverage.getBeveragePrice() + 2.00;
    }

}
