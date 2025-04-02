package com.example.decoratordp;

import com.example.decoratordp.models.Beverage;
import com.example.decoratordp.models.Cappucino;
import com.example.decoratordp.models.Caramel;
import com.example.decoratordp.models.Espresso;
import com.example.decoratordp.models.Milk;

public class Main {
    public static void main(String[] args) {
        System.out.println("Coffee House!");

        // Create a Cappucino
        Beverage beverage = new Cappucino();
        System.out.println("Beverage: " + beverage.getBeverageName());
        System.out.println("Price: $" + beverage.getBeveragePrice());
        System.out.println();
        // Add milk to the beverage
        beverage = new Milk(beverage);
        System.out.println("Beverage: " + beverage.getBeverageName());
        System.out.println("Price: $" + beverage.getBeveragePrice());
        System.out.println();
        // Add caramel to the beverage
        beverage = new Caramel(beverage);
        System.out.println("Beverage: " + beverage.getBeverageName());
        System.out.println("Price: $" + beverage.getBeveragePrice());
        System.out.println();

        Beverage espBeverage = new Espresso();
        System.out.println("Beverage: " + espBeverage.getBeverageName());
        System.out.println("Price: $" + espBeverage.getBeveragePrice());
        System.out.println();
        // Add milk to the beverage
        espBeverage = new Milk(espBeverage);
        System.out.println("Beverage: " + espBeverage.getBeverageName());
        System.out.println("Price: $" + espBeverage.getBeveragePrice());
        System.out.println();
        // Add milk again to the beverage
        espBeverage = new Milk(espBeverage);
        System.out.println("Beverage: " + espBeverage.getBeverageName());
        System.out.println("Price: $" + espBeverage.getBeveragePrice());
        System.out.println();
    
    }
}