package com.example.decoratordp.models;

public class Caramel extends IngredientDecorator {
    Beverage beverage;

    public Caramel(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getBeverageName() {
        return beverage.getBeverageName() + ", Caramel";
    }

    @Override
    public double getBeveragePrice() {
        return beverage.getBeveragePrice() + 2.75;
    }

}
