package com.example.cardgame.models;

public class BlackjackCard extends Card{
    public BlackjackCard(int value, SuiteType suiteType) {
        super(value, suiteType);
    }

    @Override
    public int getValue() {
        if (value > 10) {
            return 10;
        } else {
            return value;
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
