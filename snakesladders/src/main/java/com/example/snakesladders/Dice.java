package com.example.snakesladders;

public class Dice {
    int noOfDices;
    int value;

    public Dice(int noOfDices) {
        this.noOfDices = noOfDices;
        this.value = 0;
    }

    public int rollDice() {
        value = 0;
        for (int i = 0; i < noOfDices; i++) {
            value += (int) (Math.random() * 6) + 1; // Simulate rolling a die
        }
        return value;
    }

}
